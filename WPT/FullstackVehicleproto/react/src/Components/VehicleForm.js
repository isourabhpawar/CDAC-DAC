import { Link, useNavigate, useParams } from "react-router-dom";





import { useState, useEffect } from "react";
import VehicleService from "../Services/VehicleService";

const VehicleForm = () => {
  const [vid, setvid] = useState("");
  const [vname, setvname] = useState("");
  const [price, setprice] = useState("");

  const navigate = useNavigate();

  const params = useParams();

  const saveVeh = () => {

    const vehicle = { vid, vname, price };
    console.log(vehicle);
    if (params.vid) {
      //update
      console.log("in saveVeh update section......" + params.vid);
      VehicleService.updateVeh(vehicle).then((result) => {
        console.log(result.data);
        navigate("/");
      });
    } else {
      console.log("in else ");
      //insert
      VehicleService.insertVeh(vehicle)
        .then((result) => {
          console.log("in else part vehicle insert");
          console.log(result.data);
          navigate("/");
        })
        .catch((err) => {
          console.log(err);
        });
    }
  };

  useEffect(() => {
    console.log("in outer useEffect" + params.vid);
    if (params.vid) {
      console.log("in inner ID useEffect");
      VehicleService.getVehiclebyId(params.vid)
        .then((result) => {
          setprice(result.data.price);
          setvid(result.data.vid);
          setvname(result.data.vname);
        })
        .catch((error) => {
          console.log("Something went wrong", error);
        });
    }
  }, []);

  return (
    <div>
      <form>
        <label htmlFor="vid">vid</label>
        <input
          type="text"
          id="vid"
          value={vid}
          onChange={(x) => setvid(x.target.value)}
        ></input>
        <br />
        <label htmlFor="vname">vname</label>
        <input
          type="text"
          id="vname"
          value={vname}
          onChange={(x) => setvname(x.target.value)}
        ></input>
        <br />
        <label htmlFor="price">price</label>
        <input
          type="text"
          id="price"
          value={price}
          onChange={(x) => setprice(x.target.value)}
        ></input>
        <br />
        <button type="button" id="btn" onClick={saveVeh}>
          SaveorUpdate
        </button>
      </form>
    </div>
  );
};

export default VehicleForm;
