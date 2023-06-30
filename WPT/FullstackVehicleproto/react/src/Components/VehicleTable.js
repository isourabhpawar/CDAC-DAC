import React, { Component } from "react";
import { Link } from "react-router-dom";
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
  fetchdata() {
    console.log("in fetch data");
    VehicleService.getVehicles()
      .then((result) => {
        console.log(result.data);
        this.setState({ ...this.state, varr: result.data });
      })
      .catch((err) => {
        console.log(err);
      });
  }

  delete = (id) => {
    console.log("in delete func");
    VehicleService.deleteById(id).then((result) => {
      console.log(result.data);
      this.fetchdata();
    });
  };

  componentDidMount() {
    this.fetchdata();
    console.log(" in component did mount");
  }

  render() {
    return (
      <div>
        <Link to="/form">
          <button type="button" id="btn">
            AddnewVehicle
          </button>
        </Link>
        <br />
        <br />
        <table border="2px">
          <thead>
            <tr>
              <td>vid</td>
              <td>vname</td>
              <td>price</td>
              <td>action</td>
            </tr>
          </thead>
          <tbody>
            {this.state.varr.map((veh) => (
              <tr key={veh.vid}>
                <td>{veh.vid}</td>
                <td>{veh.vname}</td>
                <td>{veh.price}</td>
                <td>
                  <button
                    type="button"
                    onClick={() => {
                      console.log(veh.vid);
                      this.delete(veh.vid);
                    }}
                  >
                    delete
                  </button>

                  <Link to={`/edit/${veh.vid} `}>
                    
                    <button>edit</button>
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
