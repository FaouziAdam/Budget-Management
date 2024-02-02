package Harmoniz.demo.DTO;

import Harmoniz.demo.Entities.TypeDeFlux;

public record AppFluxDTO(
        Integer mois,
        TypeDeFlux typeDeFlux,
        String libelle,
        Double montant
) {
}
