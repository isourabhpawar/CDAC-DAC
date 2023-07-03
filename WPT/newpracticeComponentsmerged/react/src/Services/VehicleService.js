import axios from 'axios'



const baseurl="http://localhost:3005"
class VehicleService{



    getVehiclebyId=(id)=>{

        return axios.get(baseurl+"/vehicles/"+id)

    }
    getVehicles=()=>{

        return axios.get(baseurl+"/vehicles/")

    }

    deleteById(id){
        return axios.delete(baseurl+"/vehicles/delete/"+id)
    }


    insertVeh(veh){
        console.log("in insertveh "+veh.vid)
        return axios.post(baseurl+"/vehicles/vehicle/",veh)
    }

    updateVeh(veh){
        console.log("in insertveh "+veh.vid)
        return axios.put(baseurl+"/vehicles/vehicle/",veh)
    }
    


}


export  default new VehicleService;