import React from "react";
import logo from "./logo.jpg"
import "bootstrap/dist/css/bootstrap.min.css";

export default () => {
    const style = {
        // paddingBottom: "50px",
        maxHeight: "300px",

    }
    return (
        <>

            <div>
                Welcome
                <div class="text-center">
                    <img src={logo}
                        style={style}
                            />
                </div>
                <div class="text-center">Developed by:</div>
                <div class="text-center">
                    <h3>Faisal</h3>
                </div>
                <div class="text-center">tuneinfaisal@gmail.com</div>
            </div>
        </>
    );
};
