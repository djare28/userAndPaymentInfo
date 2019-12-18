package com.example.userandpaymentinfo.dto;

import com.example.userandpaymentinfo.model.NacinPlacanja;

public class PodaciORacunuDTO {

    private Long id;
    private NacinPlacanja nacinPlacanja;
    private Long brojRacuna;
    private Long casopisId;
    private int cenaZaPretplatu;

    public int getCenaZaPretplatu() {
        return cenaZaPretplatu;
    }

    public void setCenaZaPretplatu(int cenaZaPretplatu) {
        this.cenaZaPretplatu = cenaZaPretplatu;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public NacinPlacanja getNacinPlacanja() {
        return nacinPlacanja;
    }

    public void setNacinPlacanja(NacinPlacanja nacinPlacanja) {
        this.nacinPlacanja = nacinPlacanja;
    }

    public Long getBrojRacuna() {
        return brojRacuna;
    }

    public void setBrojRacuna(Long brojRacuna) {
        this.brojRacuna = brojRacuna;
    }

    public Long getCasopisId() {
        return casopisId;
    }

    public void setCasopisId(Long casopisId) {
        this.casopisId = casopisId;
    }

    public PodaciORacunuDTO() {
    }
}
