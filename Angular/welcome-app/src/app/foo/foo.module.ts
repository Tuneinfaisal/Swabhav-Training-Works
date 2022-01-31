import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { BarComponent } from './bar/bar.component';
import { JazComponent } from './jaz/jaz.component';



@NgModule({
  declarations: [
    BarComponent,
    JazComponent
  ],
  imports: [
    CommonModule
  ],
  exports: [
    BarComponent,
    JazComponent
  ]
})
export class FooModule { }
