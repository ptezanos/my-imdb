import { Component, Input } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Router } from '@angular/router';

@Component({
  selector: 'app-navigation-button',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './navigation-button.component.html',
  styleUrl: './navigation-button.component.css'
})
export class NavigationButtonComponent {

  @Input() title!: string;
  @Input() pageName!: string;

  constructor(private router: Router) { }

  goToPage(){
    this.router.navigate([`${this.pageName}`]);
  }

}
