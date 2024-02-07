package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ReportRoot extends Entity implements Parsable {
    /**
     * Instantiates a new ReportRoot and sets the default values.
     */
    public ReportRoot() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ReportRoot
     */
    @jakarta.annotation.Nonnull
    public static ReportRoot createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ReportRoot();
    }
    /**
     * Gets the appCredentialSignInActivities property value. Represents a collection of sign-in activities of application credentials.
     * @return a java.util.List<AppCredentialSignInActivity>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AppCredentialSignInActivity> getAppCredentialSignInActivities() {
        return this.backingStore.get("appCredentialSignInActivities");
    }
    /**
     * Gets the applicationSignInDetailedSummary property value. Represents a detailed summary of an application sign-in.
     * @return a java.util.List<ApplicationSignInDetailedSummary>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ApplicationSignInDetailedSummary> getApplicationSignInDetailedSummary() {
        return this.backingStore.get("applicationSignInDetailedSummary");
    }
    /**
     * Gets the authenticationMethods property value. Container for navigation properties for Microsoft Entra authentication methods resources.
     * @return a AuthenticationMethodsRoot
     */
    @jakarta.annotation.Nullable
    public AuthenticationMethodsRoot getAuthenticationMethods() {
        return this.backingStore.get("authenticationMethods");
    }
    /**
     * Gets the credentialUserRegistrationDetails property value. Details of the usage of self-service password reset and multifactor authentication (MFA) for all registered users.
     * @return a java.util.List<CredentialUserRegistrationDetails>
     */
    @jakarta.annotation.Nullable
    public java.util.List<CredentialUserRegistrationDetails> getCredentialUserRegistrationDetails() {
        return this.backingStore.get("credentialUserRegistrationDetails");
    }
    /**
     * Gets the dailyPrintUsage property value. The dailyPrintUsage property
     * @return a java.util.List<PrintUsage>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrintUsage> getDailyPrintUsage() {
        return this.backingStore.get("dailyPrintUsage");
    }
    /**
     * Gets the dailyPrintUsageByPrinter property value. Retrieve a list of daily print usage summaries, grouped by printer.
     * @return a java.util.List<PrintUsageByPrinter>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrintUsageByPrinter> getDailyPrintUsageByPrinter() {
        return this.backingStore.get("dailyPrintUsageByPrinter");
    }
    /**
     * Gets the dailyPrintUsageByUser property value. Retrieve a list of daily print usage summaries, grouped by user.
     * @return a java.util.List<PrintUsageByUser>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrintUsageByUser> getDailyPrintUsageByUser() {
        return this.backingStore.get("dailyPrintUsageByUser");
    }
    /**
     * Gets the dailyPrintUsageSummariesByPrinter property value. The dailyPrintUsageSummariesByPrinter property
     * @return a java.util.List<PrintUsageByPrinter>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrintUsageByPrinter> getDailyPrintUsageSummariesByPrinter() {
        return this.backingStore.get("dailyPrintUsageSummariesByPrinter");
    }
    /**
     * Gets the dailyPrintUsageSummariesByUser property value. The dailyPrintUsageSummariesByUser property
     * @return a java.util.List<PrintUsageByUser>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrintUsageByUser> getDailyPrintUsageSummariesByUser() {
        return this.backingStore.get("dailyPrintUsageSummariesByUser");
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
        deserializerMap.put("partners", (n) -> { this.setPartners(n.getObjectValue(Partners::createFromDiscriminatorValue)); });
        deserializerMap.put("security", (n) -> { this.setSecurity(n.getObjectValue(SecurityReportsRoot::createFromDiscriminatorValue)); });
        deserializerMap.put("serviceActivity", (n) -> { this.setServiceActivity(n.getObjectValue(ServiceActivity::createFromDiscriminatorValue)); });
        deserializerMap.put("servicePrincipalSignInActivities", (n) -> { this.setServicePrincipalSignInActivities(n.getCollectionOfObjectValues(ServicePrincipalSignInActivity::createFromDiscriminatorValue)); });
        deserializerMap.put("sla", (n) -> { this.setSla(n.getObjectValue(ServiceLevelAgreementRoot::createFromDiscriminatorValue)); });
        deserializerMap.put("userCredentialUsageDetails", (n) -> { this.setUserCredentialUsageDetails(n.getCollectionOfObjectValues(UserCredentialUsageDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("userInsights", (n) -> { this.setUserInsights(n.getObjectValue(UserInsightsRoot::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the monthlyPrintUsageByPrinter property value. Retrieve a list of monthly print usage summaries, grouped by printer.
     * @return a java.util.List<PrintUsageByPrinter>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrintUsageByPrinter> getMonthlyPrintUsageByPrinter() {
        return this.backingStore.get("monthlyPrintUsageByPrinter");
    }
    /**
     * Gets the monthlyPrintUsageByUser property value. Retrieve a list of monthly print usage summaries, grouped by user.
     * @return a java.util.List<PrintUsageByUser>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrintUsageByUser> getMonthlyPrintUsageByUser() {
        return this.backingStore.get("monthlyPrintUsageByUser");
    }
    /**
     * Gets the monthlyPrintUsageSummariesByPrinter property value. The monthlyPrintUsageSummariesByPrinter property
     * @return a java.util.List<PrintUsageByPrinter>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrintUsageByPrinter> getMonthlyPrintUsageSummariesByPrinter() {
        return this.backingStore.get("monthlyPrintUsageSummariesByPrinter");
    }
    /**
     * Gets the monthlyPrintUsageSummariesByUser property value. The monthlyPrintUsageSummariesByUser property
     * @return a java.util.List<PrintUsageByUser>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrintUsageByUser> getMonthlyPrintUsageSummariesByUser() {
        return this.backingStore.get("monthlyPrintUsageSummariesByUser");
    }
    /**
     * Gets the partners property value. Represents billing details for a Microsoft direct partner.
     * @return a Partners
     */
    @jakarta.annotation.Nullable
    public Partners getPartners() {
        return this.backingStore.get("partners");
    }
    /**
     * Gets the security property value. Provides the ability to launch a simulated phishing attack that organizations can learn from.
     * @return a SecurityReportsRoot
     */
    @jakarta.annotation.Nullable
    public SecurityReportsRoot getSecurity() {
        return this.backingStore.get("security");
    }
    /**
     * Gets the serviceActivity property value. Reports that relate to tenant-level authentication activities in Microsoft Entra.
     * @return a ServiceActivity
     */
    @jakarta.annotation.Nullable
    public ServiceActivity getServiceActivity() {
        return this.backingStore.get("serviceActivity");
    }
    /**
     * Gets the servicePrincipalSignInActivities property value. Represents a collection of sign-in activities of service principals.
     * @return a java.util.List<ServicePrincipalSignInActivity>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ServicePrincipalSignInActivity> getServicePrincipalSignInActivities() {
        return this.backingStore.get("servicePrincipalSignInActivities");
    }
    /**
     * Gets the sla property value. Reports that relate to tenant-level Microsoft Entra SLA attainment.
     * @return a ServiceLevelAgreementRoot
     */
    @jakarta.annotation.Nullable
    public ServiceLevelAgreementRoot getSla() {
        return this.backingStore.get("sla");
    }
    /**
     * Gets the userCredentialUsageDetails property value. Represents the self-service password reset (SSPR) usage for a given tenant.
     * @return a java.util.List<UserCredentialUsageDetails>
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserCredentialUsageDetails> getUserCredentialUsageDetails() {
        return this.backingStore.get("userCredentialUsageDetails");
    }
    /**
     * Gets the userInsights property value. Represents a collection of user activities on applications in a tenant that is configured for Microsoft Entra External ID for customers.
     * @return a UserInsightsRoot
     */
    @jakarta.annotation.Nullable
    public UserInsightsRoot getUserInsights() {
        return this.backingStore.get("userInsights");
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
        writer.writeObjectValue("partners", this.getPartners());
        writer.writeObjectValue("security", this.getSecurity());
        writer.writeObjectValue("serviceActivity", this.getServiceActivity());
        writer.writeCollectionOfObjectValues("servicePrincipalSignInActivities", this.getServicePrincipalSignInActivities());
        writer.writeObjectValue("sla", this.getSla());
        writer.writeCollectionOfObjectValues("userCredentialUsageDetails", this.getUserCredentialUsageDetails());
        writer.writeObjectValue("userInsights", this.getUserInsights());
    }
    /**
     * Sets the appCredentialSignInActivities property value. Represents a collection of sign-in activities of application credentials.
     * @param value Value to set for the appCredentialSignInActivities property.
     */
    public void setAppCredentialSignInActivities(@jakarta.annotation.Nullable final java.util.List<AppCredentialSignInActivity> value) {
        this.backingStore.set("appCredentialSignInActivities", value);
    }
    /**
     * Sets the applicationSignInDetailedSummary property value. Represents a detailed summary of an application sign-in.
     * @param value Value to set for the applicationSignInDetailedSummary property.
     */
    public void setApplicationSignInDetailedSummary(@jakarta.annotation.Nullable final java.util.List<ApplicationSignInDetailedSummary> value) {
        this.backingStore.set("applicationSignInDetailedSummary", value);
    }
    /**
     * Sets the authenticationMethods property value. Container for navigation properties for Microsoft Entra authentication methods resources.
     * @param value Value to set for the authenticationMethods property.
     */
    public void setAuthenticationMethods(@jakarta.annotation.Nullable final AuthenticationMethodsRoot value) {
        this.backingStore.set("authenticationMethods", value);
    }
    /**
     * Sets the credentialUserRegistrationDetails property value. Details of the usage of self-service password reset and multifactor authentication (MFA) for all registered users.
     * @param value Value to set for the credentialUserRegistrationDetails property.
     */
    public void setCredentialUserRegistrationDetails(@jakarta.annotation.Nullable final java.util.List<CredentialUserRegistrationDetails> value) {
        this.backingStore.set("credentialUserRegistrationDetails", value);
    }
    /**
     * Sets the dailyPrintUsage property value. The dailyPrintUsage property
     * @param value Value to set for the dailyPrintUsage property.
     */
    public void setDailyPrintUsage(@jakarta.annotation.Nullable final java.util.List<PrintUsage> value) {
        this.backingStore.set("dailyPrintUsage", value);
    }
    /**
     * Sets the dailyPrintUsageByPrinter property value. Retrieve a list of daily print usage summaries, grouped by printer.
     * @param value Value to set for the dailyPrintUsageByPrinter property.
     */
    public void setDailyPrintUsageByPrinter(@jakarta.annotation.Nullable final java.util.List<PrintUsageByPrinter> value) {
        this.backingStore.set("dailyPrintUsageByPrinter", value);
    }
    /**
     * Sets the dailyPrintUsageByUser property value. Retrieve a list of daily print usage summaries, grouped by user.
     * @param value Value to set for the dailyPrintUsageByUser property.
     */
    public void setDailyPrintUsageByUser(@jakarta.annotation.Nullable final java.util.List<PrintUsageByUser> value) {
        this.backingStore.set("dailyPrintUsageByUser", value);
    }
    /**
     * Sets the dailyPrintUsageSummariesByPrinter property value. The dailyPrintUsageSummariesByPrinter property
     * @param value Value to set for the dailyPrintUsageSummariesByPrinter property.
     */
    public void setDailyPrintUsageSummariesByPrinter(@jakarta.annotation.Nullable final java.util.List<PrintUsageByPrinter> value) {
        this.backingStore.set("dailyPrintUsageSummariesByPrinter", value);
    }
    /**
     * Sets the dailyPrintUsageSummariesByUser property value. The dailyPrintUsageSummariesByUser property
     * @param value Value to set for the dailyPrintUsageSummariesByUser property.
     */
    public void setDailyPrintUsageSummariesByUser(@jakarta.annotation.Nullable final java.util.List<PrintUsageByUser> value) {
        this.backingStore.set("dailyPrintUsageSummariesByUser", value);
    }
    /**
     * Sets the monthlyPrintUsageByPrinter property value. Retrieve a list of monthly print usage summaries, grouped by printer.
     * @param value Value to set for the monthlyPrintUsageByPrinter property.
     */
    public void setMonthlyPrintUsageByPrinter(@jakarta.annotation.Nullable final java.util.List<PrintUsageByPrinter> value) {
        this.backingStore.set("monthlyPrintUsageByPrinter", value);
    }
    /**
     * Sets the monthlyPrintUsageByUser property value. Retrieve a list of monthly print usage summaries, grouped by user.
     * @param value Value to set for the monthlyPrintUsageByUser property.
     */
    public void setMonthlyPrintUsageByUser(@jakarta.annotation.Nullable final java.util.List<PrintUsageByUser> value) {
        this.backingStore.set("monthlyPrintUsageByUser", value);
    }
    /**
     * Sets the monthlyPrintUsageSummariesByPrinter property value. The monthlyPrintUsageSummariesByPrinter property
     * @param value Value to set for the monthlyPrintUsageSummariesByPrinter property.
     */
    public void setMonthlyPrintUsageSummariesByPrinter(@jakarta.annotation.Nullable final java.util.List<PrintUsageByPrinter> value) {
        this.backingStore.set("monthlyPrintUsageSummariesByPrinter", value);
    }
    /**
     * Sets the monthlyPrintUsageSummariesByUser property value. The monthlyPrintUsageSummariesByUser property
     * @param value Value to set for the monthlyPrintUsageSummariesByUser property.
     */
    public void setMonthlyPrintUsageSummariesByUser(@jakarta.annotation.Nullable final java.util.List<PrintUsageByUser> value) {
        this.backingStore.set("monthlyPrintUsageSummariesByUser", value);
    }
    /**
     * Sets the partners property value. Represents billing details for a Microsoft direct partner.
     * @param value Value to set for the partners property.
     */
    public void setPartners(@jakarta.annotation.Nullable final Partners value) {
        this.backingStore.set("partners", value);
    }
    /**
     * Sets the security property value. Provides the ability to launch a simulated phishing attack that organizations can learn from.
     * @param value Value to set for the security property.
     */
    public void setSecurity(@jakarta.annotation.Nullable final SecurityReportsRoot value) {
        this.backingStore.set("security", value);
    }
    /**
     * Sets the serviceActivity property value. Reports that relate to tenant-level authentication activities in Microsoft Entra.
     * @param value Value to set for the serviceActivity property.
     */
    public void setServiceActivity(@jakarta.annotation.Nullable final ServiceActivity value) {
        this.backingStore.set("serviceActivity", value);
    }
    /**
     * Sets the servicePrincipalSignInActivities property value. Represents a collection of sign-in activities of service principals.
     * @param value Value to set for the servicePrincipalSignInActivities property.
     */
    public void setServicePrincipalSignInActivities(@jakarta.annotation.Nullable final java.util.List<ServicePrincipalSignInActivity> value) {
        this.backingStore.set("servicePrincipalSignInActivities", value);
    }
    /**
     * Sets the sla property value. Reports that relate to tenant-level Microsoft Entra SLA attainment.
     * @param value Value to set for the sla property.
     */
    public void setSla(@jakarta.annotation.Nullable final ServiceLevelAgreementRoot value) {
        this.backingStore.set("sla", value);
    }
    /**
     * Sets the userCredentialUsageDetails property value. Represents the self-service password reset (SSPR) usage for a given tenant.
     * @param value Value to set for the userCredentialUsageDetails property.
     */
    public void setUserCredentialUsageDetails(@jakarta.annotation.Nullable final java.util.List<UserCredentialUsageDetails> value) {
        this.backingStore.set("userCredentialUsageDetails", value);
    }
    /**
     * Sets the userInsights property value. Represents a collection of user activities on applications in a tenant that is configured for Microsoft Entra External ID for customers.
     * @param value Value to set for the userInsights property.
     */
    public void setUserInsights(@jakarta.annotation.Nullable final UserInsightsRoot value) {
        this.backingStore.set("userInsights", value);
    }
}
