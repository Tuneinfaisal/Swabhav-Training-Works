import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-gallery',
  templateUrl: './gallery.component.html',
  styleUrls: ['./gallery.component.css']
})
export class GalleryComponent implements OnInit {

  arraySize = 5;
  imageViewContainerVisibility = false;

  address = "https://source.unsplash.com/random/700x400?";
  randomImages:Array<Image> = new Array<Image>();
  currentImage = "";
  noImageSelected = true;

  constructor() { }

  ngOnInit(): void {
    for(let i=0; i<this.arraySize; i++){
      let image = new Image(this.address + 'sig=' + i);
      this.randomImages.push(image);
    }
  }

  imageClickHandler(event:any){

    this.currentImage = event.target.src;
    this.imageViewContainerVisibility = true;
    this.noImageSelected = false;
  }

  handleClearButton(){
    this.imageViewContainerVisibility = false;
    this.noImageSelected = true;
  }
}

export class Image{
  constructor(public url:string){

  }
}