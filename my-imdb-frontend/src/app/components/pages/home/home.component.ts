import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { NavigationButtonComponent } from '../../navigation-button/navigation-button.component';

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [CommonModule, NavigationButtonComponent],
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})
export class HomeComponent {

  moviesTitle: string = "SHOW MOVIES";
  moviesPageName: string = "movies";

}
