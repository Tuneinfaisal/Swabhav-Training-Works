import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { WelcomeComponent } from './welcome.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { DiscountComponent } from './discount/discount.component';
import { SpinnerComponent } from './spinner/spinner.component';
import { LoopingComponent } from './looping/looping.componect';
import { GreetComponent } from './greet/greet.component';
import { StudentComponent } from './student/student.component';
import { SnakePipe } from './snake.pipe';
import { ProductItemComponent } from './products/product-item.component';
import { ProductListComponent } from './products/product-list.component';
import { StarComponent } from './star/star.component';
import { ProductService } from './products/product.service';
import { ColorPipe } from './color.pipe';
import { ImagesThumbnailComponent } from './images-thumbnail/images-thumbnail.component';
import { GalleryComponent } from './gallery/gallery.component';
import { TwowayBindingComponent } from './twoway-binding/twoway-binding.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { TwowayBinding2Component } from './twoway-binding2/twoway-binding2.component';
import { LoginComponent } from './login/login.component';
import { NumberApiComponent } from './number-api/number-api.component';
import { HttpClientModule } from '@angular/common/http';
import { FooModule } from './foo/foo.module';

@NgModule({
  declarations: [
    WelcomeComponent,
    HeaderComponent,
    FooterComponent,
    DiscountComponent,
    SpinnerComponent,
    LoopingComponent,
    GreetComponent,
    StudentComponent,
    SnakePipe,
    ProductItemComponent,
    ProductListComponent,
    StarComponent,
    ColorPipe,
    ImagesThumbnailComponent,
    GalleryComponent,
    TwowayBindingComponent,
    TwowayBinding2Component,
    LoginComponent,
    NumberApiComponent,
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    FooModule,
  ],
  providers: [ProductService],
  bootstrap: [WelcomeComponent]
})
export class AppModule { }
