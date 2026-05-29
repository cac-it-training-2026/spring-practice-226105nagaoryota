package jp.co.sss.practice.p05.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "fruits_season")

public class FruitsSeason {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_fruits_season_gen")
	@SequenceGenerator(name = "seq_fruits_season_gen", sequenceName = "seq_fruits_season", allocationSize = 1)
	Integer fruitId;
	String fruitName;
	Integer seasonMonth;

}
