/**
 * (C)opyright, 2012, TomTec Imaging Systems GmbH The source code is protected by copyright laws and international copyright
 * treaties, as well as other intellectual property laws and treaties. All rights reserved.
 */

package org.hibernate.bugs.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "series")
public class Series
{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  private String seriesInstanceUID;
  private String description;
  private String modality;

  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "studyref")
  private Study study;

  /**
   * 
   */
  public Series()
  {
    // Auto-generated constructor stub
  }

  public int getId()
  {
    return this.id;
  }

  public void setId(int id)
  {
    this.id = id;
  }

  /**
   * @return the seriesuid
   */
  public String getSeriesInstanceUID()
  {
    return seriesInstanceUID;
  }

  /**
   * @param seriesuid the seriesuid to set
   */
  public void setSeriesInstanceUID(String seriesuid)
  {
    this.seriesInstanceUID = seriesuid;
  }

  /**
   * @return the description
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * @param description the description to set
   */
  public void setDescription(String description)
  {
    this.description = description;
  }

  /**
   * @return the modality
   */
  public String getModality()
  {
    return modality;
  }

  /**
   * @param modality the modality to set
   */
  public void setModality(String modality)
  {
    this.modality = modality;
  }

  /**
   * @return the study
   */
  public Study getStudy()
  {
    return study;
  }

  /**
   * @param study the study to set
   */
  public void setStudy(Study study)
  {
    this.study = study;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String toString()
  {
    return "Series [seriesuid=" + seriesInstanceUID + ", description=" + description + ", modality=" + modality + ", study=" + study + "]";
  }

}
