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
import jakarta.persistence.MapKeyColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "patients")
public class Patient implements Serializable
{
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  private String birthDate;

  private String patientID;

  private String sex;

  @OneToMany(mappedBy = "patient", fetch=FetchType.LAZY)
  private List<Study> studies;

  public Patient()
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


  public String getBirthDate()
  {
    return this.birthDate;
  }

  public void setBirthDate(String birthDate)
  {
    this.birthDate = birthDate;
  }

  public String getPatientID()
  {
    return this.patientID;
  }

  public void setPatientID(String patientID)
  {
    this.patientID = patientID;
  }

  public String getSex()
  {
    return this.sex;
  }

  public void setSex(String sex)
  {
    this.sex = sex;
  }

  public List<Study> getStudies()
  {
    return this.studies;
  }

  public void setStudies(List<Study> studies)
  {
    this.studies = studies;
  }


  /**
   * {@inheritDoc}
   */
  @Override
  public String toString()
  {
    return "Patient [id=" + id + ", patientID=" + patientID + ", birthDate=" + birthDate + ", sex=" + sex + "]";
  }

}
