import React, { Component } from "react";
import { Link, useNavigate } from "react-router-dom";

import VehicleService from "../Services/VehicleService";
class VehicleTable extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      varr: [],
      searchvarr: [],
      searchText: "",
    };
  }

  componentDidUpdate(prevProps, prevState) {
    if (prevState.searchText !== this.state.searchText) {
      console.log(
        "en searchtextstate change " +
          prevState.searchText +
          "-----" +
          this.state.searchText
      );
      if (this.state.searchText !== "") {
        let newarr = this.state.varr.filter((emp) =>
          emp.vname.includes(this.state.searchText)
        );
        this.setState({ ...this.state, searchvarr: [...newarr] });
      } else {
        this.setState({ ...this.state, searchvarr: this.state.varr });
      }
    }
  }

  fetchdata() {
    console.log("in fetch ..data");
    VehicleService.getVehicles()
      .then((x) => {
        console.log(x.data);
        this.setState({ ...this.state, varr: x.data, searchvarr: x.data });
      })
      .catch((err) => {
        console.log(err);
      });
  }
  componentDidMount() {
    this.fetchdata();
  }

  deleteveh(id) {
    console.log("in delete");
    VehicleService.deleteById(id)
      .then((x) => {
        this.fetchdata();
      })
      .catch((err) => {
        console.log(err);
      });
  }
  render() {
    console.log("in render" + this.state.searchvarr);
    return (
      <div>
        <Link to="/form">
          <button type="button" id="btn">
            AddnewVehicle
          </button>
        </Link>
        <input
          type="search"
          onChange={(e) => {
            this.setState({ ...this.state, searchText: e.target.value });
          }}
        ></input>
        <br />
        <br />
        <table border="200px">
          <thead>
            <tr>
              <td>vid</td>
              <td>vname</td>
              <td>price</td>
              <td>actions</td>
            </tr>
          </thead>
          <tbody>
            {this.state.searchvarr.map((veh) => (
              <tr key={veh.vid}>
                <td>{veh.vid}</td>
                <td>{veh.vname}</td>
                <td>{veh.price}</td>
                <td>
                  <Link>
                    <button
                      type="button"
                      onClick={() => this.deleteveh(veh.vid)}
                    >
                      delete
                    </button>
                  </Link>

                  <Link to={`edit/${veh.vid}`}>
                    <button type="button">edit</button>
                  </Link>
                </td>
              </tr>
            ))}
          </tbody>
        </table>
      </div>
    );
  }
}

export default VehicleTable;
