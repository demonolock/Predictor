import {Injectable} from '@angular/core';
import {City} from "./city";
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class CityService {

  constructor(private http: HttpClient) {
  }

  getCities(): Observable<City[]> {
    return this.http.get<City[]>("/api/cities");
  }
}
