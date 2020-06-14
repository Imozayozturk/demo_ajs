import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';
import { User } from '../user';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.scss']
})
export class RegisterComponent implements OnInit {

  user: User = new User();
  submitted = false;

  constructor(private userService: UserService) { }

  ngOnInit() {
  }

  newEmployee(): void {
    this.submitted = false;
    this.user = new User();
  }

  onSubmit(f: NgForm) {
    let obj: any;
    obj = {
      name: this.user["name"],
      phone: this.user["phone"],
      mobilePhone: this.user["mobilePhone"],
      email: this.user["email"],
      address: this.user["address"],

    }
    this.userService.createUser(obj)
      .subscribe(data => console.log(data), error => console.log(error));
      window.location.reload();
  }

  onCancel() {
    this.submitted = false;
  }
}
