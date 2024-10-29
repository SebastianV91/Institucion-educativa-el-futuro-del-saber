export class Estudiante {

    constructor(public id : number, 
        public tipoDocumento : string, 
        public numeroIdentidad: string,
        public nombres: string,
        public apellidos: string,
        public fechaNacimiento: Date,
        public edad: number,
        public grado: number,
        public email: string,
        public telefonoFijo: string,
        public celular: string){}

}
