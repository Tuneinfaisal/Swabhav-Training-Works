import React from "react";
import Header from "./Header";
import Footer from "./Footer";
import Greet from "./Greet";
import Products from "./Products";
import Spinner from "./Spinner";

export default () => {
    return (
        <div>
            <Header />

            {/* <Greet /> */}
            {/* <Products/> */}
            <Spinner />

            <Footer />
        </div>
    );
};
