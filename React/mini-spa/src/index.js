import ReactDom from "react-dom";
import React from "react";
import { BrowserRouter } from "react-router-dom";
import App from "./App";

ReactDom.render(
    <BrowserRouter>
        <App />
    </BrowserRouter>,
    document.getElementById("root")
);
