import { useState, useEffect } from "react";
import { useNavigate, useParams } from "react-router-dom";
import VehicleService from "../Services/VehicleService";
const VehicleForm = () => {
  const [vid, setvid] = useState("");
  const [vname, setvname] = useState("");
  const [price, setprice] = useState("");

  const parm = useParams();
  const navi = useNavigate();
  const vehicle = {  vid, price,vname };
  const saveveh = () => {
    if (parm.vid) {
      console.log("in update");

      VehicleService.updateVeh(vehicle)
        .then((x) => {
          console.log(x);
          navi("/");
        })
        .catch((err) => {
          console.log(err);
        });
    } else {
      console.log("in insert new");
      VehicleService.insertVeh(vehicle).then((x) => {
        console.log(x);
        navi("/");
      });
    }
  };

  useEffect(() => {
    if (parm.vid) {
      console.log("from edit with param");
      VehicleService.getVehiclebyId(parm.vid).then((x) => {
        console.log(x);
        setprice(x.data.price);
        setvid(x.data.vid);
        setvname(x.data.vname);
      });
    } else {
      console.log("in useeffect else");
    }
  }, []);

  return (
    <div>
      <form>
        <br />
        <br />
        <label htmlFor="vid">vid</label>
        <input
          type="text"
          value={vid}
          onChange={(e) => {
            setvid(e.target.value);
          }}
        ></input>
        <label htmlFor="vname">vname</label>
        <input
          type="text"
          value={vname}
          onChange={(e) => {
            setvname(e.target.value);
          }}
        ></input>
        <label htmlFor="price">price</label>
        <input
          type="text"
          value={price}
          onChange={(e) => {
            setprice(e.target.value);
          }}
        ></input>
        <button type="button" onClick={saveveh}>
          saveorupdate
        </button>
      </form>
    </div>
  );
};

export default VehicleForm;
