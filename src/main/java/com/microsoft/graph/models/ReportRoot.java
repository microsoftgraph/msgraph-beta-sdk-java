package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ReportRoot extends Entity implements Parsable {
    /**
     * Represents a collection of sign-in activities of application credentials.
     */
    private java.util.List<AppCredentialSignInActivity> appCredentialSignInActivities;
    /**
     * Represents a detailed summary of an application sign-in.
     */
    private java.util.List<ApplicationSignInDetailedSummary> applicationSignInDetailedSummary;
    /**
     * Container for navigation properties for Azure AD authentication methods resources.
     */
    private AuthenticationMethodsRoot authenticationMethods;
    /**
     * Details of the usage of self-service password reset and multi-factor authentication (MFA) for all registered users.
     */
    private java.util.List<CredentialUserRegistrationDetails> credentialUserRegistrationDetails;
    /**
     * The dailyPrintUsage property
     */
    private java.util.List<PrintUsage> dailyPrintUsage;
    /**
     * Retrieve a list of daily print usage summaries, grouped by printer.
     */
    private java.util.List<PrintUsageByPrinter> dailyPrintUsageByPrinter;
    /**
     * Retrieve a list of daily print usage summaries, grouped by user.
     */
    private java.util.List<PrintUsageByUser> dailyPrintUsageByUser;
    /**
     * The dailyPrintUsageSummariesByPrinter property
     */
    private java.util.List<PrintUsageByPrinter> dailyPrintUsageSummariesByPrinter;
    /**
     * The dailyPrintUsageSummariesByUser property
     */
    private java.util.List<PrintUsageByUser> dailyPrintUsageSummariesByUser;
    /**
     * Retrieve a list of monthly print usage summaries, grouped by printer.
     */
    private java.util.List<PrintUsageByPrinter> monthlyPrintUsageByPrinter;
    /**
     * Retrieve a list of monthly print usage summaries, grouped by user.
     */
    private java.util.List<PrintUsageByUser> monthlyPrintUsageByUser;
    /**
     * The monthlyPrintUsageSummariesByPrinter property
     */
    private java.util.List<PrintUsageByPrinter> monthlyPrintUsageSummariesByPrinter;
    /**
     * The monthlyPrintUsageSummariesByUser property
     */
    private java.util.List<PrintUsageByUser> monthlyPrintUsageSummariesByUser;
    /**
     * Provides the ability to launch a realistic simulated phishing attack that organizations can learn from.
     */
    private SecurityReportsRoot security;
    /**
     * Represents a collection of sign-in activities of service principals.
     */
    private java.util.List<ServicePrincipalSignInActivity> servicePrincipalSignInActivities;
    /**
     * A placeholder to allow for the desired URL path for SLA.
     */
    private ServiceLevelAgreementRoot sla;
    /**
     * Represents the self-service password reset (SSPR) usage for a given tenant.
     */
    private java.util.List<UserCredentialUsageDetails> userCredentialUsageDetails;
    /**
     * Instantiates a new reportRoot and sets the default values.
     */
    public ReportRoot() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a reportRoot
     */
    @jakarta.annotation.Nonnull
    public static ReportRoot createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ReportRoot();
    }
    /**
     * Gets the appCredentialSignInActivities property value. Represents a collection of sign-in activities of application credentials.
     * @return a appCredentialSignInActivity
     */
    @jakarta.annotation.Nullable
    public java.util.List<AppCredentialSignInActivity> getAppCredentialSignInActivities() {
        return this.appCredentialSignInActivities;
    }
    /**
     * Gets the applicationSignInDetailedSummary property value. Represents a detailed summary of an application sign-in.
     * @return a applicationSignInDetailedSummary
     */
    @jakarta.annotation.Nullable
    public java.util.List<ApplicationSignInDetailedSummary> getApplicationSignInDetailedSummary() {
        return this.applicationSignInDetailedSummary;
    }
    /**
     * Gets the authenticationMethods property value. Container for navigation properties for Azure AD authentication methods resources.
     * @return a authenticationMethodsRoot
     */
    @jakarta.annotation.Nullable
    public AuthenticationMethodsRoot getAuthenticationMethods() {
        return this.authenticationMethods;
    }
    /**
     * Gets the credentialUserRegistrationDetails property value. Details of the usage of self-service password reset and multi-factor authentication (MFA) for all registered users.
     * @return a credentialUserRegistrationDetails
     */
    @jakarta.annotation.Nullable
    public java.util.List<CredentialUserRegistrationDetails> getCredentialUserRegistrationDetails() {
        return this.credentialUserRegistrationDetails;
    }
    /**
     * Gets the dailyPrintUsage property value. The dailyPrintUsage property
     * @return a printUsage
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrintUsage> getDailyPrintUsage() {
        return this.dailyPrintUsage;
    }
    /**
     * Gets the dailyPrintUsageByPrinter property value. Retrieve a list of daily print usage summaries, grouped by printer.
     * @return a printUsageByPrinter
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrintUsageByPrinter> getDailyPrintUsageByPrinter() {
        return this.dailyPrintUsageByPrinter;
    }
    /**
     * Gets the dailyPrintUsageByUser property value. Retrieve a list of daily print usage summaries, grouped by user.
     * @return a printUsageByUser
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrintUsageByUser> getDailyPrintUsageByUser() {
        return this.dailyPrintUsageByUser;
    }
    /**
     * Gets the dailyPrintUsageSummariesByPrinter property value. The dailyPrintUsageSummariesByPrinter property
     * @return a printUsageByPrinter
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrintUsageByPrinter> getDailyPrintUsageSummariesByPrinter() {
        return this.dailyPrintUsageSummariesByPrinter;
    }
    /**
     * Gets the dailyPrintUsageSummariesByUser property value. The dailyPrintUsageSummariesByUser property
     * @return a printUsageByUser
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrintUsageByUser> getDailyPrintUsageSummariesByUser() {
        return this.dailyPrintUsageSummariesByUser;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appCredentialSignInActivities", (n) -> { this.setAppCredentialSignInActivities(n.getCollectionOfObjectValues(AppCredentialSignInActivity::createFromDiscriminatorValue)); });
        deserializerMap.put("applicationSignInDetailedSummary", (n) -> { this.setApplicationSignInDetailedSummary(n.getCollectionOfObjectValues(ApplicationSignInDetailedSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("authenticationMethods", (n) -> { this.setAuthenticationMethods(n.getObjectValue(AuthenticationMethodsRoot::createFromDiscriminatorValue)); });
        deserializerMap.put("credentialUserRegistrationDetails", (n) -> { this.setCredentialUserRegistrationDetails(n.getCollectionOfObjectValues(CredentialUserRegistrationDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("dailyPrintUsage", (n) -> { this.setDailyPrintUsage(n.getCollectionOfObjectValues(PrintUsage::createFromDiscriminatorValue)); });
        deserializerMap.put("dailyPrintUsageByPrinter", (n) -> { this.setDailyPrintUsageByPrinter(n.getCollectionOfObjectValues(PrintUsageByPrinter::createFromDiscriminatorValue)); });
        deserializerMap.put("dailyPrintUsageByUser", (n) -> { this.setDailyPrintUsageByUser(n.getCollectionOfObjectValues(PrintUsageByUser::createFromDiscriminatorValue)); });
        deserializerMap.put("dailyPrintUsageSummariesByPrinter", (n) -> { this.setDailyPrintUsageSummariesByPrinter(n.getCollectionOfObjectValues(PrintUsageByPrinter::createFromDiscriminatorValue)); });
        deserializerMap.put("dailyPrintUsageSummariesByUser", (n) -> { this.setDailyPrintUsageSummariesByUser(n.getCollectionOfObjectValues(PrintUsageByUser::createFromDiscriminatorValue)); });
        deserializerMap.put("monthlyPrintUsageByPrinter", (n) -> { this.setMonthlyPrintUsageByPrinter(n.getCollectionOfObjectValues(PrintUsageByPrinter::createFromDiscriminatorValue)); });
        deserializerMap.put("monthlyPrintUsageByUser", (n) -> { this.setMonthlyPrintUsageByUser(n.getCollectionOfObjectValues(PrintUsageByUser::createFromDiscriminatorValue)); });
        deserializerMap.put("monthlyPrintUsageSummariesByPrinter", (n) -> { this.setMonthlyPrintUsageSummariesByPrinter(n.getCollectionOfObjectValues(PrintUsageByPrinter::createFromDiscriminatorValue)); });
        deserializerMap.put("monthlyPrintUsageSummariesByUser", (n) -> { this.setMonthlyPrintUsageSummariesByUser(n.getCollectionOfObjectValues(PrintUsageByUser::createFromDiscriminatorValue)); });
        deserializerMap.put("security", (n) -> { this.setSecurity(n.getObjectValue(SecurityReportsRoot::createFromDiscriminatorValue)); });
        deserializerMap.put("servicePrincipalSignInActivities", (n) -> { this.setServicePrincipalSignInActivities(n.getCollectionOfObjectValues(ServicePrincipalSignInActivity::createFromDiscriminatorValue)); });
        deserializerMap.put("sla", (n) -> { this.setSla(n.getObjectValue(ServiceLevelAgreementRoot::createFromDiscriminatorValue)); });
        deserializerMap.put("userCredentialUsageDetails", (n) -> { this.setUserCredentialUsageDetails(n.getCollectionOfObjectValues(UserCredentialUsageDetails::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the monthlyPrintUsageByPrinter property value. Retrieve a list of monthly print usage summaries, grouped by printer.
     * @return a printUsageByPrinter
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrintUsageByPrinter> getMonthlyPrintUsageByPrinter() {
        return this.monthlyPrintUsageByPrinter;
    }
    /**
     * Gets the monthlyPrintUsageByUser property value. Retrieve a list of monthly print usage summaries, grouped by user.
     * @return a printUsageByUser
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrintUsageByUser> getMonthlyPrintUsageByUser() {
        return this.monthlyPrintUsageByUser;
    }
    /**
     * Gets the monthlyPrintUsageSummariesByPrinter property value. The monthlyPrintUsageSummariesByPrinter property
     * @return a printUsageByPrinter
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrintUsageByPrinter> getMonthlyPrintUsageSummariesByPrinter() {
        return this.monthlyPrintUsageSummariesByPrinter;
    }
    /**
     * Gets the monthlyPrintUsageSummariesByUser property value. The monthlyPrintUsageSummariesByUser property
     * @return a printUsageByUser
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrintUsageByUser> getMonthlyPrintUsageSummariesByUser() {
        return this.monthlyPrintUsageSummariesByUser;
    }
    /**
     * Gets the security property value. Provides the ability to launch a realistic simulated phishing attack that organizations can learn from.
     * @return a securityReportsRoot
     */
    @jakarta.annotation.Nullable
    public SecurityReportsRoot getSecurity() {
        return this.security;
    }
    /**
     * Gets the servicePrincipalSignInActivities property value. Represents a collection of sign-in activities of service principals.
     * @return a servicePrincipalSignInActivity
     */
    @jakarta.annotation.Nullable
    public java.util.List<ServicePrincipalSignInActivity> getServicePrincipalSignInActivities() {
        return this.servicePrincipalSignInActivities;
    }
    /**
     * Gets the sla property value. A placeholder to allow for the desired URL path for SLA.
     * @return a serviceLevelAgreementRoot
     */
    @jakarta.annotation.Nullable
    public ServiceLevelAgreementRoot getSla() {
        return this.sla;
    }
    /**
     * Gets the userCredentialUsageDetails property value. Represents the self-service password reset (SSPR) usage for a given tenant.
     * @return a userCredentialUsageDetails
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserCredentialUsageDetails> getUserCredentialUsageDetails() {
        return this.userCredentialUsageDetails;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("appCredentialSignInActivities", this.getAppCredentialSignInActivities());
        writer.writeCollectionOfObjectValues("applicationSignInDetailedSummary", this.getApplicationSignInDetailedSummary());
        writer.writeObjectValue("authenticationMethods", this.getAuthenticationMethods());
        writer.writeCollectionOfObjectValues("credentialUserRegistrationDetails", this.getCredentialUserRegistrationDetails());
        writer.writeCollectionOfObjectValues("dailyPrintUsage", this.getDailyPrintUsage());
        writer.writeCollectionOfObjectValues("dailyPrintUsageByPrinter", this.getDailyPrintUsageByPrinter());
        writer.writeCollectionOfObjectValues("dailyPrintUsageByUser", this.getDailyPrintUsageByUser());
        writer.writeCollectionOfObjectValues("dailyPrintUsageSummariesByPrinter", this.getDailyPrintUsageSummariesByPrinter());
        writer.writeCollectionOfObjectValues("dailyPrintUsageSummariesByUser", this.getDailyPrintUsageSummariesByUser());
        writer.writeCollectionOfObjectValues("monthlyPrintUsageByPrinter", this.getMonthlyPrintUsageByPrinter());
        writer.writeCollectionOfObjectValues("monthlyPrintUsageByUser", this.getMonthlyPrintUsageByUser());
        writer.writeCollectionOfObjectValues("monthlyPrintUsageSummariesByPrinter", this.getMonthlyPrintUsageSummariesByPrinter());
        writer.writeCollectionOfObjectValues("monthlyPrintUsageSummariesByUser", this.getMonthlyPrintUsageSummariesByUser());
        writer.writeObjectValue("security", this.getSecurity());
        writer.writeCollectionOfObjectValues("servicePrincipalSignInActivities", this.getServicePrincipalSignInActivities());
        writer.writeObjectValue("sla", this.getSla());
        writer.writeCollectionOfObjectValues("userCredentialUsageDetails", this.getUserCredentialUsageDetails());
    }
    /**
     * Sets the appCredentialSignInActivities property value. Represents a collection of sign-in activities of application credentials.
     * @param value Value to set for the appCredentialSignInActivities property.
     */
    public void setAppCredentialSignInActivities(@jakarta.annotation.Nullable final java.util.List<AppCredentialSignInActivity> value) {
        this.appCredentialSignInActivities = value;
    }
    /**
     * Sets the applicationSignInDetailedSummary property value. Represents a detailed summary of an application sign-in.
     * @param value Value to set for the applicationSignInDetailedSummary property.
     */
    public void setApplicationSignInDetailedSummary(@jakarta.annotation.Nullable final java.util.List<ApplicationSignInDetailedSummary> value) {
        this.applicationSignInDetailedSummary = value;
    }
    /**
     * Sets the authenticationMethods property value. Container for navigation properties for Azure AD authentication methods resources.
     * @param value Value to set for the authenticationMethods property.
     */
    public void setAuthenticationMethods(@jakarta.annotation.Nullable final AuthenticationMethodsRoot value) {
        this.authenticationMethods = value;
    }
    /**
     * Sets the credentialUserRegistrationDetails property value. Details of the usage of self-service password reset and multi-factor authentication (MFA) for all registered users.
     * @param value Value to set for the credentialUserRegistrationDetails property.
     */
    public void setCredentialUserRegistrationDetails(@jakarta.annotation.Nullable final java.util.List<CredentialUserRegistrationDetails> value) {
        this.credentialUserRegistrationDetails = value;
    }
    /**
     * Sets the dailyPrintUsage property value. The dailyPrintUsage property
     * @param value Value to set for the dailyPrintUsage property.
     */
    public void setDailyPrintUsage(@jakarta.annotation.Nullable final java.util.List<PrintUsage> value) {
        this.dailyPrintUsage = value;
    }
    /**
     * Sets the dailyPrintUsageByPrinter property value. Retrieve a list of daily print usage summaries, grouped by printer.
     * @param value Value to set for the dailyPrintUsageByPrinter property.
     */
    public void setDailyPrintUsageByPrinter(@jakarta.annotation.Nullable final java.util.List<PrintUsageByPrinter> value) {
        this.dailyPrintUsageByPrinter = value;
    }
    /**
     * Sets the dailyPrintUsageByUser property value. Retrieve a list of daily print usage summaries, grouped by user.
     * @param value Value to set for the dailyPrintUsageByUser property.
     */
    public void setDailyPrintUsageByUser(@jakarta.annotation.Nullable final java.util.List<PrintUsageByUser> value) {
        this.dailyPrintUsageByUser = value;
    }
    /**
     * Sets the dailyPrintUsageSummariesByPrinter property value. The dailyPrintUsageSummariesByPrinter property
     * @param value Value to set for the dailyPrintUsageSummariesByPrinter property.
     */
    public void setDailyPrintUsageSummariesByPrinter(@jakarta.annotation.Nullable final java.util.List<PrintUsageByPrinter> value) {
        this.dailyPrintUsageSummariesByPrinter = value;
    }
    /**
     * Sets the dailyPrintUsageSummariesByUser property value. The dailyPrintUsageSummariesByUser property
     * @param value Value to set for the dailyPrintUsageSummariesByUser property.
     */
    public void setDailyPrintUsageSummariesByUser(@jakarta.annotation.Nullable final java.util.List<PrintUsageByUser> value) {
        this.dailyPrintUsageSummariesByUser = value;
    }
    /**
     * Sets the monthlyPrintUsageByPrinter property value. Retrieve a list of monthly print usage summaries, grouped by printer.
     * @param value Value to set for the monthlyPrintUsageByPrinter property.
     */
    public void setMonthlyPrintUsageByPrinter(@jakarta.annotation.Nullable final java.util.List<PrintUsageByPrinter> value) {
        this.monthlyPrintUsageByPrinter = value;
    }
    /**
     * Sets the monthlyPrintUsageByUser property value. Retrieve a list of monthly print usage summaries, grouped by user.
     * @param value Value to set for the monthlyPrintUsageByUser property.
     */
    public void setMonthlyPrintUsageByUser(@jakarta.annotation.Nullable final java.util.List<PrintUsageByUser> value) {
        this.monthlyPrintUsageByUser = value;
    }
    /**
     * Sets the monthlyPrintUsageSummariesByPrinter property value. The monthlyPrintUsageSummariesByPrinter property
     * @param value Value to set for the monthlyPrintUsageSummariesByPrinter property.
     */
    public void setMonthlyPrintUsageSummariesByPrinter(@jakarta.annotation.Nullable final java.util.List<PrintUsageByPrinter> value) {
        this.monthlyPrintUsageSummariesByPrinter = value;
    }
    /**
     * Sets the monthlyPrintUsageSummariesByUser property value. The monthlyPrintUsageSummariesByUser property
     * @param value Value to set for the monthlyPrintUsageSummariesByUser property.
     */
    public void setMonthlyPrintUsageSummariesByUser(@jakarta.annotation.Nullable final java.util.List<PrintUsageByUser> value) {
        this.monthlyPrintUsageSummariesByUser = value;
    }
    /**
     * Sets the security property value. Provides the ability to launch a realistic simulated phishing attack that organizations can learn from.
     * @param value Value to set for the security property.
     */
    public void setSecurity(@jakarta.annotation.Nullable final SecurityReportsRoot value) {
        this.security = value;
    }
    /**
     * Sets the servicePrincipalSignInActivities property value. Represents a collection of sign-in activities of service principals.
     * @param value Value to set for the servicePrincipalSignInActivities property.
     */
    public void setServicePrincipalSignInActivities(@jakarta.annotation.Nullable final java.util.List<ServicePrincipalSignInActivity> value) {
        this.servicePrincipalSignInActivities = value;
    }
    /**
     * Sets the sla property value. A placeholder to allow for the desired URL path for SLA.
     * @param value Value to set for the sla property.
     */
    public void setSla(@jakarta.annotation.Nullable final ServiceLevelAgreementRoot value) {
        this.sla = value;
    }
    /**
     * Sets the userCredentialUsageDetails property value. Represents the self-service password reset (SSPR) usage for a given tenant.
     * @param value Value to set for the userCredentialUsageDetails property.
     */
    public void setUserCredentialUsageDetails(@jakarta.annotation.Nullable final java.util.List<UserCredentialUsageDetails> value) {
        this.userCredentialUsageDetails = value;
    }
}
