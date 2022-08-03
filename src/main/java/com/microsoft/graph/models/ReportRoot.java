package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ReportRoot extends Entity implements Parsable {
    /** Represents a detailed summary of an application sign-in. */
    private java.util.List<ApplicationSignInDetailedSummary> _applicationSignInDetailedSummary;
    /** Container for navigation properties for Azure AD authentication methods resources. */
    private AuthenticationMethodsRoot _authenticationMethods;
    /** Details of the usage of self-service password reset and multi-factor authentication (MFA) for all registered users. */
    private java.util.List<CredentialUserRegistrationDetails> _credentialUserRegistrationDetails;
    /** The dailyPrintUsageByPrinter property */
    private java.util.List<PrintUsageByPrinter> _dailyPrintUsageByPrinter;
    /** The dailyPrintUsageByUser property */
    private java.util.List<PrintUsageByUser> _dailyPrintUsageByUser;
    /** The dailyPrintUsageSummariesByPrinter property */
    private java.util.List<PrintUsageByPrinter> _dailyPrintUsageSummariesByPrinter;
    /** The dailyPrintUsageSummariesByUser property */
    private java.util.List<PrintUsageByUser> _dailyPrintUsageSummariesByUser;
    /** The monthlyPrintUsageByPrinter property */
    private java.util.List<PrintUsageByPrinter> _monthlyPrintUsageByPrinter;
    /** The monthlyPrintUsageByUser property */
    private java.util.List<PrintUsageByUser> _monthlyPrintUsageByUser;
    /** The monthlyPrintUsageSummariesByPrinter property */
    private java.util.List<PrintUsageByPrinter> _monthlyPrintUsageSummariesByPrinter;
    /** The monthlyPrintUsageSummariesByUser property */
    private java.util.List<PrintUsageByUser> _monthlyPrintUsageSummariesByUser;
    /** Provides the ability to launch a realistic simulated phishing attack that organizations can learn from. */
    private SecurityReportsRoot _security;
    /** Represents the self-service password reset (SSPR) usage for a given tenant. */
    private java.util.List<UserCredentialUsageDetails> _userCredentialUsageDetails;
    /**
     * Instantiates a new ReportRoot and sets the default values.
     * @return a void
     */
    public ReportRoot() {
        super();
        this.setOdataType("#microsoft.graph.reportRoot");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ReportRoot
     */
    @javax.annotation.Nonnull
    public static ReportRoot createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ReportRoot();
    }
    /**
     * Gets the applicationSignInDetailedSummary property value. Represents a detailed summary of an application sign-in.
     * @return a applicationSignInDetailedSummary
     */
    @javax.annotation.Nullable
    public java.util.List<ApplicationSignInDetailedSummary> getApplicationSignInDetailedSummary() {
        return this._applicationSignInDetailedSummary;
    }
    /**
     * Gets the authenticationMethods property value. Container for navigation properties for Azure AD authentication methods resources.
     * @return a authenticationMethodsRoot
     */
    @javax.annotation.Nullable
    public AuthenticationMethodsRoot getAuthenticationMethods() {
        return this._authenticationMethods;
    }
    /**
     * Gets the credentialUserRegistrationDetails property value. Details of the usage of self-service password reset and multi-factor authentication (MFA) for all registered users.
     * @return a credentialUserRegistrationDetails
     */
    @javax.annotation.Nullable
    public java.util.List<CredentialUserRegistrationDetails> getCredentialUserRegistrationDetails() {
        return this._credentialUserRegistrationDetails;
    }
    /**
     * Gets the dailyPrintUsageByPrinter property value. The dailyPrintUsageByPrinter property
     * @return a printUsageByPrinter
     */
    @javax.annotation.Nullable
    public java.util.List<PrintUsageByPrinter> getDailyPrintUsageByPrinter() {
        return this._dailyPrintUsageByPrinter;
    }
    /**
     * Gets the dailyPrintUsageByUser property value. The dailyPrintUsageByUser property
     * @return a printUsageByUser
     */
    @javax.annotation.Nullable
    public java.util.List<PrintUsageByUser> getDailyPrintUsageByUser() {
        return this._dailyPrintUsageByUser;
    }
    /**
     * Gets the dailyPrintUsageSummariesByPrinter property value. The dailyPrintUsageSummariesByPrinter property
     * @return a printUsageByPrinter
     */
    @javax.annotation.Nullable
    public java.util.List<PrintUsageByPrinter> getDailyPrintUsageSummariesByPrinter() {
        return this._dailyPrintUsageSummariesByPrinter;
    }
    /**
     * Gets the dailyPrintUsageSummariesByUser property value. The dailyPrintUsageSummariesByUser property
     * @return a printUsageByUser
     */
    @javax.annotation.Nullable
    public java.util.List<PrintUsageByUser> getDailyPrintUsageSummariesByUser() {
        return this._dailyPrintUsageSummariesByUser;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ReportRoot currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("applicationSignInDetailedSummary", (n) -> { currentObject.setApplicationSignInDetailedSummary(n.getCollectionOfObjectValues(ApplicationSignInDetailedSummary::createFromDiscriminatorValue)); });
            this.put("authenticationMethods", (n) -> { currentObject.setAuthenticationMethods(n.getObjectValue(AuthenticationMethodsRoot::createFromDiscriminatorValue)); });
            this.put("credentialUserRegistrationDetails", (n) -> { currentObject.setCredentialUserRegistrationDetails(n.getCollectionOfObjectValues(CredentialUserRegistrationDetails::createFromDiscriminatorValue)); });
            this.put("dailyPrintUsageByPrinter", (n) -> { currentObject.setDailyPrintUsageByPrinter(n.getCollectionOfObjectValues(PrintUsageByPrinter::createFromDiscriminatorValue)); });
            this.put("dailyPrintUsageByUser", (n) -> { currentObject.setDailyPrintUsageByUser(n.getCollectionOfObjectValues(PrintUsageByUser::createFromDiscriminatorValue)); });
            this.put("dailyPrintUsageSummariesByPrinter", (n) -> { currentObject.setDailyPrintUsageSummariesByPrinter(n.getCollectionOfObjectValues(PrintUsageByPrinter::createFromDiscriminatorValue)); });
            this.put("dailyPrintUsageSummariesByUser", (n) -> { currentObject.setDailyPrintUsageSummariesByUser(n.getCollectionOfObjectValues(PrintUsageByUser::createFromDiscriminatorValue)); });
            this.put("monthlyPrintUsageByPrinter", (n) -> { currentObject.setMonthlyPrintUsageByPrinter(n.getCollectionOfObjectValues(PrintUsageByPrinter::createFromDiscriminatorValue)); });
            this.put("monthlyPrintUsageByUser", (n) -> { currentObject.setMonthlyPrintUsageByUser(n.getCollectionOfObjectValues(PrintUsageByUser::createFromDiscriminatorValue)); });
            this.put("monthlyPrintUsageSummariesByPrinter", (n) -> { currentObject.setMonthlyPrintUsageSummariesByPrinter(n.getCollectionOfObjectValues(PrintUsageByPrinter::createFromDiscriminatorValue)); });
            this.put("monthlyPrintUsageSummariesByUser", (n) -> { currentObject.setMonthlyPrintUsageSummariesByUser(n.getCollectionOfObjectValues(PrintUsageByUser::createFromDiscriminatorValue)); });
            this.put("security", (n) -> { currentObject.setSecurity(n.getObjectValue(SecurityReportsRoot::createFromDiscriminatorValue)); });
            this.put("userCredentialUsageDetails", (n) -> { currentObject.setUserCredentialUsageDetails(n.getCollectionOfObjectValues(UserCredentialUsageDetails::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the monthlyPrintUsageByPrinter property value. The monthlyPrintUsageByPrinter property
     * @return a printUsageByPrinter
     */
    @javax.annotation.Nullable
    public java.util.List<PrintUsageByPrinter> getMonthlyPrintUsageByPrinter() {
        return this._monthlyPrintUsageByPrinter;
    }
    /**
     * Gets the monthlyPrintUsageByUser property value. The monthlyPrintUsageByUser property
     * @return a printUsageByUser
     */
    @javax.annotation.Nullable
    public java.util.List<PrintUsageByUser> getMonthlyPrintUsageByUser() {
        return this._monthlyPrintUsageByUser;
    }
    /**
     * Gets the monthlyPrintUsageSummariesByPrinter property value. The monthlyPrintUsageSummariesByPrinter property
     * @return a printUsageByPrinter
     */
    @javax.annotation.Nullable
    public java.util.List<PrintUsageByPrinter> getMonthlyPrintUsageSummariesByPrinter() {
        return this._monthlyPrintUsageSummariesByPrinter;
    }
    /**
     * Gets the monthlyPrintUsageSummariesByUser property value. The monthlyPrintUsageSummariesByUser property
     * @return a printUsageByUser
     */
    @javax.annotation.Nullable
    public java.util.List<PrintUsageByUser> getMonthlyPrintUsageSummariesByUser() {
        return this._monthlyPrintUsageSummariesByUser;
    }
    /**
     * Gets the security property value. Provides the ability to launch a realistic simulated phishing attack that organizations can learn from.
     * @return a securityReportsRoot
     */
    @javax.annotation.Nullable
    public SecurityReportsRoot getSecurity() {
        return this._security;
    }
    /**
     * Gets the userCredentialUsageDetails property value. Represents the self-service password reset (SSPR) usage for a given tenant.
     * @return a userCredentialUsageDetails
     */
    @javax.annotation.Nullable
    public java.util.List<UserCredentialUsageDetails> getUserCredentialUsageDetails() {
        return this._userCredentialUsageDetails;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("applicationSignInDetailedSummary", this.getApplicationSignInDetailedSummary());
        writer.writeObjectValue("authenticationMethods", this.getAuthenticationMethods());
        writer.writeCollectionOfObjectValues("credentialUserRegistrationDetails", this.getCredentialUserRegistrationDetails());
        writer.writeCollectionOfObjectValues("dailyPrintUsageByPrinter", this.getDailyPrintUsageByPrinter());
        writer.writeCollectionOfObjectValues("dailyPrintUsageByUser", this.getDailyPrintUsageByUser());
        writer.writeCollectionOfObjectValues("dailyPrintUsageSummariesByPrinter", this.getDailyPrintUsageSummariesByPrinter());
        writer.writeCollectionOfObjectValues("dailyPrintUsageSummariesByUser", this.getDailyPrintUsageSummariesByUser());
        writer.writeCollectionOfObjectValues("monthlyPrintUsageByPrinter", this.getMonthlyPrintUsageByPrinter());
        writer.writeCollectionOfObjectValues("monthlyPrintUsageByUser", this.getMonthlyPrintUsageByUser());
        writer.writeCollectionOfObjectValues("monthlyPrintUsageSummariesByPrinter", this.getMonthlyPrintUsageSummariesByPrinter());
        writer.writeCollectionOfObjectValues("monthlyPrintUsageSummariesByUser", this.getMonthlyPrintUsageSummariesByUser());
        writer.writeObjectValue("security", this.getSecurity());
        writer.writeCollectionOfObjectValues("userCredentialUsageDetails", this.getUserCredentialUsageDetails());
    }
    /**
     * Sets the applicationSignInDetailedSummary property value. Represents a detailed summary of an application sign-in.
     * @param value Value to set for the applicationSignInDetailedSummary property.
     * @return a void
     */
    public void setApplicationSignInDetailedSummary(@javax.annotation.Nullable final java.util.List<ApplicationSignInDetailedSummary> value) {
        this._applicationSignInDetailedSummary = value;
    }
    /**
     * Sets the authenticationMethods property value. Container for navigation properties for Azure AD authentication methods resources.
     * @param value Value to set for the authenticationMethods property.
     * @return a void
     */
    public void setAuthenticationMethods(@javax.annotation.Nullable final AuthenticationMethodsRoot value) {
        this._authenticationMethods = value;
    }
    /**
     * Sets the credentialUserRegistrationDetails property value. Details of the usage of self-service password reset and multi-factor authentication (MFA) for all registered users.
     * @param value Value to set for the credentialUserRegistrationDetails property.
     * @return a void
     */
    public void setCredentialUserRegistrationDetails(@javax.annotation.Nullable final java.util.List<CredentialUserRegistrationDetails> value) {
        this._credentialUserRegistrationDetails = value;
    }
    /**
     * Sets the dailyPrintUsageByPrinter property value. The dailyPrintUsageByPrinter property
     * @param value Value to set for the dailyPrintUsageByPrinter property.
     * @return a void
     */
    public void setDailyPrintUsageByPrinter(@javax.annotation.Nullable final java.util.List<PrintUsageByPrinter> value) {
        this._dailyPrintUsageByPrinter = value;
    }
    /**
     * Sets the dailyPrintUsageByUser property value. The dailyPrintUsageByUser property
     * @param value Value to set for the dailyPrintUsageByUser property.
     * @return a void
     */
    public void setDailyPrintUsageByUser(@javax.annotation.Nullable final java.util.List<PrintUsageByUser> value) {
        this._dailyPrintUsageByUser = value;
    }
    /**
     * Sets the dailyPrintUsageSummariesByPrinter property value. The dailyPrintUsageSummariesByPrinter property
     * @param value Value to set for the dailyPrintUsageSummariesByPrinter property.
     * @return a void
     */
    public void setDailyPrintUsageSummariesByPrinter(@javax.annotation.Nullable final java.util.List<PrintUsageByPrinter> value) {
        this._dailyPrintUsageSummariesByPrinter = value;
    }
    /**
     * Sets the dailyPrintUsageSummariesByUser property value. The dailyPrintUsageSummariesByUser property
     * @param value Value to set for the dailyPrintUsageSummariesByUser property.
     * @return a void
     */
    public void setDailyPrintUsageSummariesByUser(@javax.annotation.Nullable final java.util.List<PrintUsageByUser> value) {
        this._dailyPrintUsageSummariesByUser = value;
    }
    /**
     * Sets the monthlyPrintUsageByPrinter property value. The monthlyPrintUsageByPrinter property
     * @param value Value to set for the monthlyPrintUsageByPrinter property.
     * @return a void
     */
    public void setMonthlyPrintUsageByPrinter(@javax.annotation.Nullable final java.util.List<PrintUsageByPrinter> value) {
        this._monthlyPrintUsageByPrinter = value;
    }
    /**
     * Sets the monthlyPrintUsageByUser property value. The monthlyPrintUsageByUser property
     * @param value Value to set for the monthlyPrintUsageByUser property.
     * @return a void
     */
    public void setMonthlyPrintUsageByUser(@javax.annotation.Nullable final java.util.List<PrintUsageByUser> value) {
        this._monthlyPrintUsageByUser = value;
    }
    /**
     * Sets the monthlyPrintUsageSummariesByPrinter property value. The monthlyPrintUsageSummariesByPrinter property
     * @param value Value to set for the monthlyPrintUsageSummariesByPrinter property.
     * @return a void
     */
    public void setMonthlyPrintUsageSummariesByPrinter(@javax.annotation.Nullable final java.util.List<PrintUsageByPrinter> value) {
        this._monthlyPrintUsageSummariesByPrinter = value;
    }
    /**
     * Sets the monthlyPrintUsageSummariesByUser property value. The monthlyPrintUsageSummariesByUser property
     * @param value Value to set for the monthlyPrintUsageSummariesByUser property.
     * @return a void
     */
    public void setMonthlyPrintUsageSummariesByUser(@javax.annotation.Nullable final java.util.List<PrintUsageByUser> value) {
        this._monthlyPrintUsageSummariesByUser = value;
    }
    /**
     * Sets the security property value. Provides the ability to launch a realistic simulated phishing attack that organizations can learn from.
     * @param value Value to set for the security property.
     * @return a void
     */
    public void setSecurity(@javax.annotation.Nullable final SecurityReportsRoot value) {
        this._security = value;
    }
    /**
     * Sets the userCredentialUsageDetails property value. Represents the self-service password reset (SSPR) usage for a given tenant.
     * @param value Value to set for the userCredentialUsageDetails property.
     * @return a void
     */
    public void setUserCredentialUsageDetails(@javax.annotation.Nullable final java.util.List<UserCredentialUsageDetails> value) {
        this._userCredentialUsageDetails = value;
    }
}
