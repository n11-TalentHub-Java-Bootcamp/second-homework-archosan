package com.cihanozmen.springboot.entityService;

import com.cihanozmen.springboot.dao.KategoriDao;
import com.cihanozmen.springboot.entity.Kategori;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KategoriEntityService  {

     @Autowired
     private KategoriDao kategoriDao;


     public List<Kategori> findAll(){

          return  (List<Kategori>) kategoriDao.findAll();
     }

     public Kategori findById(Long id){
          Optional<Kategori> optionalKategori = kategoriDao.findById(id);

          Kategori kategori = null ;

          if(optionalKategori.isPresent()){
               kategori = optionalKategori.get();
          }

          return  kategori;
     }

     public Kategori save(Kategori kategori){
          kategori = kategoriDao.save(kategori);
          return  kategori;

     }

     public void delete(Kategori kategori){
          kategoriDao.delete(kategori);
     }

     public void deleteById(Long id) {
          kategoriDao.deleteById(id);

     }

     public long count(){
          long count = kategoriDao.count();
          return  count;
     }

     public  List<Kategori> findAllByUstKategoriIsNull(){
          return kategoriDao.findAllByUstKategoriIsNull();
     }
}
