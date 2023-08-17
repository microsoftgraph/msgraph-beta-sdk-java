package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class LogonUser implements AdditionalDataHolder, Parsable {
    /**
     * Domain of user account used to logon.
     */
    private String accountDomain;
    /**
     * Account name of user account used to logon.
     */
    private String accountName;
    /**
     * User Account type, per Windows definition. Possible values are: unknown, standard, power, administrator.
     */
    private UserAccountSecurityType accountType;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * DateTime at which the earliest logon by this user account occurred (provider-determined period). The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     */
    private OffsetDateTime firstSeenDateTime;
    /**
     * DateTime at which the latest logon by this user account occurred. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     */
    private OffsetDateTime lastSeenDateTime;
    /**
     * User logon ID.
     */
    private String logonId;
    /**
     * Collection of the logon types observed for the logged on user from when first to last seen. Possible values are: unknown, interactive, remoteInteractive, network, batch, service.
     */
    private java.util.List<LogonType> logonTypes;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new logonUser and sets the default values.
     */
    public LogonUser() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a logonUser
     */
    @jakarta.annotation.Nonnull
    public static LogonUser createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LogonUser();
    }
    /**
     * Gets the accountDomain property value. Domain of user account used to logon.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAccountDomain() {
        return this.accountDomain;
    }
    /**
     * Gets the accountName property value. Account name of user account used to logon.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAccountName() {
        return this.accountName;
    }
    /**
     * Gets the accountType property value. User Account type, per Windows definition. Possible values are: unknown, standard, power, administrator.
     * @return a userAccountSecurityType
     */
    @jakarta.annotation.Nullable
    public UserAccountSecurityType getAccountType() {
        return this.accountType;
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("accountDomain", (n) -> { this.setAccountDomain(n.getStringValue()); });
        deserializerMap.put("accountName", (n) -> { this.setAccountName(n.getStringValue()); });
        deserializerMap.put("accountType", (n) -> { this.setAccountType(n.getEnumValue(UserAccountSecurityType.class)); });
        deserializerMap.put("firstSeenDateTime", (n) -> { this.setFirstSeenDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastSeenDateTime", (n) -> { this.setLastSeenDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("logonId", (n) -> { this.setLogonId(n.getStringValue()); });
        deserializerMap.put("logonTypes", (n) -> { this.setLogonTypes(n.getCollectionOfEnumValues(LogonType.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the firstSeenDateTime property value. DateTime at which the earliest logon by this user account occurred (provider-determined period). The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getFirstSeenDateTime() {
        return this.firstSeenDateTime;
    }
    /**
     * Gets the lastSeenDateTime property value. DateTime at which the latest logon by this user account occurred. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastSeenDateTime() {
        return this.lastSeenDateTime;
    }
    /**
     * Gets the logonId property value. User logon ID.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getLogonId() {
        return this.logonId;
    }
    /**
     * Gets the logonTypes property value. Collection of the logon types observed for the logged on user from when first to last seen. Possible values are: unknown, interactive, remoteInteractive, network, batch, service.
     * @return a logonType
     */
    @jakarta.annotation.Nullable
    public java.util.List<LogonType> getLogonTypes() {
        return this.logonTypes;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("accountDomain", this.getAccountDomain());
        writer.writeStringValue("accountName", this.getAccountName());
        writer.writeEnumValue("accountType", this.getAccountType());
        writer.writeOffsetDateTimeValue("firstSeenDateTime", this.getFirstSeenDateTime());
        writer.writeOffsetDateTimeValue("lastSeenDateTime", this.getLastSeenDateTime());
        writer.writeStringValue("logonId", this.getLogonId());
        writer.writeCollectionOfEnumValues("logonTypes", this.getLogonTypes());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the accountDomain property value. Domain of user account used to logon.
     * @param value Value to set for the accountDomain property.
     */
    public void setAccountDomain(@jakarta.annotation.Nullable final String value) {
        this.accountDomain = value;
    }
    /**
     * Sets the accountName property value. Account name of user account used to logon.
     * @param value Value to set for the accountName property.
     */
    public void setAccountName(@jakarta.annotation.Nullable final String value) {
        this.accountName = value;
    }
    /**
     * Sets the accountType property value. User Account type, per Windows definition. Possible values are: unknown, standard, power, administrator.
     * @param value Value to set for the accountType property.
     */
    public void setAccountType(@jakarta.annotation.Nullable final UserAccountSecurityType value) {
        this.accountType = value;
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the firstSeenDateTime property value. DateTime at which the earliest logon by this user account occurred (provider-determined period). The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the firstSeenDateTime property.
     */
    public void setFirstSeenDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.firstSeenDateTime = value;
    }
    /**
     * Sets the lastSeenDateTime property value. DateTime at which the latest logon by this user account occurred. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the lastSeenDateTime property.
     */
    public void setLastSeenDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastSeenDateTime = value;
    }
    /**
     * Sets the logonId property value. User logon ID.
     * @param value Value to set for the logonId property.
     */
    public void setLogonId(@jakarta.annotation.Nullable final String value) {
        this.logonId = value;
    }
    /**
     * Sets the logonTypes property value. Collection of the logon types observed for the logged on user from when first to last seen. Possible values are: unknown, interactive, remoteInteractive, network, batch, service.
     * @param value Value to set for the logonTypes property.
     */
    public void setLogonTypes(@jakarta.annotation.Nullable final java.util.List<LogonType> value) {
        this.logonTypes = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
