import{ title } from 'process'
import React, { Component } from 'react'

export class IntroComponents extends Component<{title?:string},{ description?:string} , {type?:string , releaseYear?:number}>  {
     state ={
        title: "Benvenuti al sud",
        description: "Commedia",
        type: "Film",
        releaseYear: 2010,
        
    }
    render() {
        return (
            <div>
                <button onClick={()=>console.log(this.state.title)}>
                 <h1>{this.state.title}</h1>
                 <h2>{this.state.description}</h2>
                 <h3>{this.state.type}</h3>
                 <h4>{this.state.releaseYear}</h4>

                    Click
                </button>

                 IntroComponent
            </div>
        )
    }
}
export default IntroComponents