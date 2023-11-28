import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { NavigationButtonComponent } from '../../navigation-button/navigation-button.component';

@Component({
  selector: 'app-selected-person',
  standalone: true,
  imports: [CommonModule, NavigationButtonComponent],
  templateUrl: './selected-person.component.html',
  styleUrl: './selected-person.component.css'
})
export class SelectedPersonComponent {

  moviesTitle: string = "BACK TO MOVIES";
  moviesPageName: string = "movies";

}
