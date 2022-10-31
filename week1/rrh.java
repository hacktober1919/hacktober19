package com.enphase.australia_stormwatch.services;
//add all imported packages
import com.enphase.australia_stormwatch.models.LocationIdToSiteMap;
import com.enphase.australia_stormwatch.models.SystemInfo;
import com.enphase.australia_stormwatch.repositiories.SystemInfoRepository;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
