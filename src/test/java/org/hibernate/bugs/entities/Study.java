/**
 * $Id$
 * (C)opyright, 2012, TomTec Imaging Systems GmbH
 * The source code is protected by copyright laws and international copyright
 * treaties, as well as other intellectual property laws and treaties. 
 * All rights reserved.
 */

package org.hibernate.bugs.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapKeyColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

import static jakarta.persistence.CascadeType.DETACH;
import static jakarta.persistence.CascadeType.MERGE;
import static jakarta.persistence.CascadeType.PERSIST;
import static jakarta.persistence.CascadeType.REFRESH;


@Entity
@Table(name = "studies")
public class Study implements Serializable
{
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  private String accessionNumber;


  @ManyToOne(fetch=FetchType.LAZY)
  @JoinColumn(name = "patientref")
  private Patient patient;

  @OneToMany(mappedBy = "study", fetch=FetchType.LAZY)
  private List<Series> series;

  public Study()
  {
  }

  public int getId()
  {
    return this.id;
  }

  public void setId(int id)
  {
    this.id = id;
  }

  public String getAccessionNumber()
  {
    return this.accessionNumber;
  }

  public void setAccessionNumber(String accessionNumber)
  {
    this.accessionNumber = accessionNumber;
  }


  public Patient getPatient()
  {
    return this.patient;
  }

  public void setPatient(Patient patient)
  {
    this.patient = patient;
  }

  /**
   * @return the series
   */
  public List<Series> getSeries()
  {
    return series;
  }

  /**
   * @param series the series to set
   */
  public void setSeries(List<Series> series)
  {
    this.series = series;
  }

  public static long getSerialVersionUID()
  {
    return serialVersionUID;
  }


  @Override
  public String toString()
  {
    return "Study{" +
      "id=" + id +
      ", accessionNumber='" + accessionNumber + '\'' +
      '}';
  }
}
