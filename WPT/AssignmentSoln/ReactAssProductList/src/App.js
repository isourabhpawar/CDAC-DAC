import React, { Component } from "react";
import ProductList from "./components/ProductList";

class App extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      arr: ["pencil", "pen"],
      name: "products",
    };
  }

  addprod = (pd) => {
    this.setState({ ...this.state, arr: [...this.state.arr, pd] });
  };

  render() {
    return (
      <div>
        Product List
        <ProductList prodarr={this.state.arr} insertprod={this.addprod} />
      </div>
    );
  }
}

export default App;