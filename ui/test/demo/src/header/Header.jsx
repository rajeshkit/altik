import React from "react"
class Headerss extends React.Component{
    constructor(){
        super();
        this.state = {
            counter : 46
        }
        this.timer();
    }   
    timer(){
        setInterval(() => {
            this.setState({
                counter: this.state.counter + 1
            });
        }, 2000);
    }
    render(){
        
            return <div>
                <div>Hai Class Component</div>
                <h1>{this.state.counter}</h1>
            </div>
    }
}
export default Headerss;