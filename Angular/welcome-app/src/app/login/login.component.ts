import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'sw-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  formLogin = new FormGroup({
    'userName':new FormControl('',Validators.minLength(5)),
    'userPassword':new FormControl('',Validators.required)
  });
  constructor() { }

  ngOnInit(): void {
  }

}
