import {Component, OnInit} from '@angular/core';
import {City} from "./shared/city";
import {CityService} from "./shared/city.service";

@Component({
  selector: 'app-city-list',
  providers: [CityService],
  templateUrl: './city-list.component.html',
  styleUrls: ['./city-list.component.css']
})
export class CityListComponent implements OnInit {
  cities: City[];

  constructor(private cityService: CityService) {
  }

  ngOnInit() {
    this.getCities();
  }

  getCities() {
    this.cityService.getCities().subscribe(
      (cities) => {
        this.cities = cities;
      },
      (error) => {
        console.error(error)
      }
    );
  }

}
