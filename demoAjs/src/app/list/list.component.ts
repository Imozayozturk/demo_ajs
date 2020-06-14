import { Component, OnInit } from '@angular/core';
import { User } from '../user';
import { Observable } from 'rxjs';
import { UserService } from '../user.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.scss']
})
export class ListComponent implements OnInit {
  userList: Observable<User[]>;

  constructor(private userService: UserService,
    private router: Router) {}

  ngOnInit() {
    this.reloadData();
  }

  reloadData() {
    this.userList = this.userService.getUserList();
  }

  deleteUser(id: number) {
    this.userService.deleteUser(id)
      .subscribe(
        data => {
          console.log(data);
          this.reloadData();
        },
        error => console.log(error));
  }

  updateUser(id: number){
  this.router.navigate(['/user']);
}
}