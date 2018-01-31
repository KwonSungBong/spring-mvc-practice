CREATE TABLE test_domain (
  id MEDIUMINT NOT NULL AUTO_INCREMENT,
  name VARCHAR (255),
  test VARCHAR (255),
  PRIMARY KEY (id)
);

INSERT INTO test_domain VALUES(1,'name', 'test');

CREATE TABLE `segment` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `configuration` varchar(4000) COLLATE utf8_unicode_ci DEFAULT NULL,
  `device_count` bigint(20) DEFAULT NULL,
  `last_result_uri` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `description` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `modified_at` datetime DEFAULT NULL,
  `is_deployed` tinyint(1) DEFAULT '0',
  `intermediate_result_uri` varchar(1024) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

CREATE TABLE `campaign` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `created_at` datetime NOT NULL,
  `description` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ended_at` date DEFAULT NULL,
  `max_cpv` float NOT NULL,
  `modified_at` datetime DEFAULT NULL,
  `started_at` date NOT NULL,
  `status` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `title` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `total_amount` bigint(20) NOT NULL,
  `advertiser_user` bigint(20) NOT NULL,
  `type` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT 'FREE, CHARGE, HOUSE',
  `admin_user` bigint(20) DEFAULT NULL,
  `reader_password` varchar(16) COLLATE utf8_unicode_ci DEFAULT NULL,
  `is_exclusive_internal_ad` bit(1) NOT NULL DEFAULT b'1',
  `brand_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ad_sales_agency_contact` bigint(20) DEFAULT NULL,
  `ad_sales_agency_manager_contact` bigint(20) DEFAULT NULL,
  `ad_sales_agency_payment_manager_contact` bigint(20) DEFAULT NULL,
  `advertiser_contact` bigint(20) DEFAULT NULL,
  `media_rep_contact` bigint(20) DEFAULT NULL,
  `agency_contact` bigint(20) DEFAULT NULL,
  `special_contract` varchar(2000) COLLATE utf8_unicode_ci DEFAULT NULL,
  `sign_ad_contact` bigint(20) DEFAULT NULL,
  `sign_media_contact` bigint(20) DEFAULT NULL,
  `receipted_at` date DEFAULT NULL,
  `received_account_number` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `payment_condition` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `promoted_amount` float DEFAULT NULL,
  `media_campaign_manager_contact` bigint(20) DEFAULT NULL,
  `media_campaign_op_manager_contact` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

CREATE TABLE `advertisement` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `campaign` bigint(20) NOT NULL,
  `is_deleted` bit(1) NOT NULL DEFAULT b'0',
  `start_at` date DEFAULT NULL,
  `end_at` date DEFAULT NULL,
  `target_impression_cnt` bigint(20) NOT NULL,
  `required_device_count` bigint(20) NOT NULL DEFAULT '100000',
  `fixed_slot` int(11) NOT NULL DEFAULT '0',
  `freq_apply_unit` varchar(10) COLLATE utf8_unicode_ci NOT NULL DEFAULT 'DAY',
  `min_freq` bigint(20) NOT NULL DEFAULT '3',
  `max_freq` bigint(20) NOT NULL DEFAULT '24',
  `device_expired_days` int(11) DEFAULT NULL,
  `priority` int(11) NOT NULL,
  `view_sequence` int(11) DEFAULT NULL,
  `description` varchar(2000) COLLATE utf8_unicode_ci DEFAULT NULL,
  `assign_ratio` float NOT NULL DEFAULT '0',
  `media_mix` bigint(20) NOT NULL,
  `created_at` datetime NOT NULL,
  `modified_at` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_mwprx024mpahmy6r530v71vko` (`campaign`),
  CONSTRAINT `FK_mwprx024mpahmy6r530v71vko` FOREIGN KEY (`campaign`) REFERENCES `campaign` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

CREATE TABLE `advertisement_segment` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `advertisement` bigint(20) NOT NULL,
  `segment` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_advertisement_segment_1_idx` (`advertisement`),
  KEY `fk_advertisement_segment_2_idx` (`segment`),
  CONSTRAINT `fk_advertisement_segment_1` FOREIGN KEY (`advertisement`) REFERENCES `advertisement` (`id`) ON DELETE CASCADE ON UPDATE NO ACTION,
  CONSTRAINT `fk_advertisement_segment_2` FOREIGN KEY (`segment`) REFERENCES `segment` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;