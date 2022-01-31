import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'color'
})
export class ColorPipe implements PipeTransform {

  transform(value: string, casing: number): unknown {
    if(casing >= 8) {
      value = `<td bgcolor="green">`;
    }
    else if(casing >= 6) {
      value = `<td bgcolor = "blue">`;
    }
    else {
      value = `<td bgcolor = "red">`;
    }
    return value;
  }

}
