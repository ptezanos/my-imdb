import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { NavigationButtonComponent } from '../navigation-button/navigation-button.component';

@Component({
  selector: 'app-movies',
  standalone: true,
  imports: [CommonModule, NavigationButtonComponent],
  templateUrl: './movies.component.html',
  styleUrl: './movies.component.css'
})
export class MoviesComponent {

  homeTitle: string = "HOME";
  homePageName: string = "";

}
