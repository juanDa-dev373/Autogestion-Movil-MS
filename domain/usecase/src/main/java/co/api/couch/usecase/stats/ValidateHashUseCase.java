package co.api.couch.usecase.stats;

import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;

@Log
@RequiredArgsConstructor
public class ValidateHashUseCase {

//    public Mono<Boolean> validateHash(Stats stats) {
//        log.info("Inicia el proceso de validacion de hash");
//        String concatenar = String.join(",", generarArrayString(stats));
//        String generarCadenaMD5 = md5(concatenar);
//        return Mono.just(generarCadenaMD5.equals(stats.getHash()));
//
//    }
//
//    private String md5(String hash) {
//        try{
//            log.info("Iniciando generacion de cadena MD5 para los campos del request");
//            MessageDigest md = MessageDigest.getInstance("MD5");
//            byte[] digest = md.digest(hash.getBytes());
//            StringBuilder sb = new StringBuilder();
//            for (byte b : digest) sb.append(String.format("%02x", b));
//            log.info("se genero la cadena MD5: "+sb.toString());
//            return sb.toString();
//        }catch (Exception ex){
//            log.warning("Error generando cadena MD5 con los campos");
//            throw new RuntimeException("Error Generando cadena MD5 con los campos", ex);
//        }
//    }
//
//    private String[] generarArrayString(Stats stats) {
//        return new String[]{
//                String.valueOf(stats.getTotalContactoClientes()),
//                String.valueOf(stats.getMotivoReclamo()),
//                String.valueOf(stats.getMotivoGarantia()),
//                String.valueOf(stats.getMotivoDuda()),
//                String.valueOf(stats.getMotivoCompra()),
//                String.valueOf(stats.getMotivoFelicitaciones()),
//                String.valueOf(stats.getMotivoCambio())};
//    }
}
