import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { NumberApiComponent } from './number-api/number-api.component';
import { TryComponent } from './try/try.component';

@NgModule({
  declarations: [
    AppComponent,
    NumberApiComponent,
    TryComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
