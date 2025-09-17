package com.microsoft.graph.beta.models.networkaccess;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CloudApplicationCategory implements ValuedEnum {
    HostingServices("hostingServices"),
    ItServices("itServices"),
    AccountingAndFinance("accountingAndFinance"),
    BusinessManagement("businessManagement"),
    Productivity("productivity"),
    ECommerce("eCommerce"),
    Education("education"),
    Marketing("marketing"),
    HumanResourceManagement("humanResourceManagement"),
    Health("health"),
    Security("security"),
    GenerativeAi("generativeAi"),
    NewsAndEntertainment("newsAndEntertainment"),
    OperationsManagement("operationsManagement"),
    ContentManagement("contentManagement"),
    DevelopmentTools("developmentTools"),
    Collaboration("collaboration"),
    Crm("crm"),
    Communications("communications"),
    DataAnalytics("dataAnalytics"),
    Advertising("advertising"),
    SupplyChainAndLogistics("supplyChainAndLogistics"),
    ProjectManagement("projectManagement"),
    TransportationAndTravel("transportationAndTravel"),
    CloudComputingPlatform("cloudComputingPlatform"),
    BusinessIntelligence("businessIntelligence"),
    CloudStorage("cloudStorage"),
    PropertyManagement("propertyManagement"),
    ContentSharing("contentSharing"),
    CustomerSupport("customerSupport"),
    Sales("sales"),
    ProductDesign("productDesign"),
    SocialNetwork("socialNetwork"),
    OnlineMeetings("onlineMeetings"),
    Webmail("webmail"),
    InternetOfThings("internetOfThings"),
    Forums("forums"),
    WebAnalytics("webAnalytics"),
    WebsiteMonitoring("websiteMonitoring"),
    VendorManagementSystem("vendorManagementSystem"),
    PersonalInstantMessaging("personalInstantMessaging"),
    CodeHosting("codeHosting"),
    UnknownFutureValue("unknownFutureValue"),
    McpServer("mcpServer"),
    AiModelProvider("aiModelProvider");
    public final String value;
    CloudApplicationCategory(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CloudApplicationCategory forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "hostingServices": return HostingServices;
            case "itServices": return ItServices;
            case "accountingAndFinance": return AccountingAndFinance;
            case "businessManagement": return BusinessManagement;
            case "productivity": return Productivity;
            case "eCommerce": return ECommerce;
            case "education": return Education;
            case "marketing": return Marketing;
            case "humanResourceManagement": return HumanResourceManagement;
            case "health": return Health;
            case "security": return Security;
            case "generativeAi": return GenerativeAi;
            case "newsAndEntertainment": return NewsAndEntertainment;
            case "operationsManagement": return OperationsManagement;
            case "contentManagement": return ContentManagement;
            case "developmentTools": return DevelopmentTools;
            case "collaboration": return Collaboration;
            case "crm": return Crm;
            case "communications": return Communications;
            case "dataAnalytics": return DataAnalytics;
            case "advertising": return Advertising;
            case "supplyChainAndLogistics": return SupplyChainAndLogistics;
            case "projectManagement": return ProjectManagement;
            case "transportationAndTravel": return TransportationAndTravel;
            case "cloudComputingPlatform": return CloudComputingPlatform;
            case "businessIntelligence": return BusinessIntelligence;
            case "cloudStorage": return CloudStorage;
            case "propertyManagement": return PropertyManagement;
            case "contentSharing": return ContentSharing;
            case "customerSupport": return CustomerSupport;
            case "sales": return Sales;
            case "productDesign": return ProductDesign;
            case "socialNetwork": return SocialNetwork;
            case "onlineMeetings": return OnlineMeetings;
            case "webmail": return Webmail;
            case "internetOfThings": return InternetOfThings;
            case "forums": return Forums;
            case "webAnalytics": return WebAnalytics;
            case "websiteMonitoring": return WebsiteMonitoring;
            case "vendorManagementSystem": return VendorManagementSystem;
            case "personalInstantMessaging": return PersonalInstantMessaging;
            case "codeHosting": return CodeHosting;
            case "unknownFutureValue": return UnknownFutureValue;
            case "mcpServer": return McpServer;
            case "aiModelProvider": return AiModelProvider;
            default: return null;
        }
    }
}
