package com.microsoft.graph.beta.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AppCategory implements ValuedEnum {
    Security("security"),
    Collaboration("collaboration"),
    HostingServices("hostingServices"),
    OnlineMeetings("onlineMeetings"),
    NewsAndEntertainment("newsAndEntertainment"),
    ECommerce("eCommerce"),
    Education("education"),
    CloudStorage("cloudStorage"),
    Marketing("marketing"),
    OperationsManagement("operationsManagement"),
    Health("health"),
    Advertising("advertising"),
    Productivity("productivity"),
    AccountingAndFinance("accountingAndFinance"),
    ContentManagement("contentManagement"),
    ContentSharing("contentSharing"),
    BusinessManagement("businessManagement"),
    Communications("communications"),
    DataAnalytics("dataAnalytics"),
    BusinessIntelligence("businessIntelligence"),
    Webemail("webemail"),
    CodeHosting("codeHosting"),
    WebAnalytics("webAnalytics"),
    SocialNetwork("socialNetwork"),
    Crm("crm"),
    Forums("forums"),
    HumanResourceManagement("humanResourceManagement"),
    TransportationAndTravel("transportationAndTravel"),
    ProductDesign("productDesign"),
    Sales("sales"),
    CloudComputingPlatform("cloudComputingPlatform"),
    ProjectManagement("projectManagement"),
    PersonalInstantMessaging("personalInstantMessaging"),
    DevelopmentTools("developmentTools"),
    ItServices("itServices"),
    SupplyChainAndLogistics("supplyChainAndLogistics"),
    PropertyManagement("propertyManagement"),
    CustomerSupport("customerSupport"),
    InternetOfThings("internetOfThings"),
    VendorManagementSystems("vendorManagementSystems"),
    WebsiteMonitoring("websiteMonitoring"),
    GenerativeAi("generativeAi"),
    Unknown("unknown"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AppCategory(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AppCategory forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "security": return Security;
            case "collaboration": return Collaboration;
            case "hostingServices": return HostingServices;
            case "onlineMeetings": return OnlineMeetings;
            case "newsAndEntertainment": return NewsAndEntertainment;
            case "eCommerce": return ECommerce;
            case "education": return Education;
            case "cloudStorage": return CloudStorage;
            case "marketing": return Marketing;
            case "operationsManagement": return OperationsManagement;
            case "health": return Health;
            case "advertising": return Advertising;
            case "productivity": return Productivity;
            case "accountingAndFinance": return AccountingAndFinance;
            case "contentManagement": return ContentManagement;
            case "contentSharing": return ContentSharing;
            case "businessManagement": return BusinessManagement;
            case "communications": return Communications;
            case "dataAnalytics": return DataAnalytics;
            case "businessIntelligence": return BusinessIntelligence;
            case "webemail": return Webemail;
            case "codeHosting": return CodeHosting;
            case "webAnalytics": return WebAnalytics;
            case "socialNetwork": return SocialNetwork;
            case "crm": return Crm;
            case "forums": return Forums;
            case "humanResourceManagement": return HumanResourceManagement;
            case "transportationAndTravel": return TransportationAndTravel;
            case "productDesign": return ProductDesign;
            case "sales": return Sales;
            case "cloudComputingPlatform": return CloudComputingPlatform;
            case "projectManagement": return ProjectManagement;
            case "personalInstantMessaging": return PersonalInstantMessaging;
            case "developmentTools": return DevelopmentTools;
            case "itServices": return ItServices;
            case "supplyChainAndLogistics": return SupplyChainAndLogistics;
            case "propertyManagement": return PropertyManagement;
            case "customerSupport": return CustomerSupport;
            case "internetOfThings": return InternetOfThings;
            case "vendorManagementSystems": return VendorManagementSystems;
            case "websiteMonitoring": return WebsiteMonitoring;
            case "generativeAi": return GenerativeAi;
            case "unknown": return Unknown;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
