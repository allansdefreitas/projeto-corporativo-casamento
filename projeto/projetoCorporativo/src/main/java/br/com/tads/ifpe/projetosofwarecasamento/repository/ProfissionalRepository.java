package br.com.tads.ifpe.projetosofwarecasamento.repository;

import static br.com.tads.ifpe.projetosofwarecasamento.Papel.CONJUGE;
import static br.com.tads.ifpe.projetosofwarecasamento.Papel.CONVIDADO;
import static br.com.tads.ifpe.projetosofwarecasamento.Papel.PROFISSIONAL;
import br.com.tads.ifpe.projetosofwarecasamento.model.Profissional;
import javax.annotation.security.DeclareRoles;
import javax.ejb.Stateless;

@Stateless
@DeclareRoles({CONJUGE, PROFISSIONAL, CONVIDADO})
public class ProfissionalRepository extends Repository<Profissional> {

    public ProfissionalRepository() {
        super(Profissional.class);
    }
}