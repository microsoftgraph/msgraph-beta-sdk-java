package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class LogonUser implements AdditionalDataHolder, Parsable {
    /** Domain of user account used to logon. */
    private String _accountDomain;
    /** Account name of user account used to logon. */
    private String _accountName;
    /** User Account type, per Windows definition. Possible values are: unknown, standard, power, administrator. */
    private UserAccountSecurityType _accountType;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** DateTime at which the earliest logon by this user account occurred (provider-determined period). The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. */
    private OffsetDateTime _firstSeenDateTime;
    /** DateTime at which the latest logon by this user account occurred. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. */
    private OffsetDateTime _lastSeenDateTime;
    /** User logon ID. */
    private String _logonId;
    /** Collection of the logon types observed for the logged on user from when first to last seen. Possible values are: unknown, interactive, remoteInteractive, network, batch, service. */
    private java.util.List<String> _logonTypes;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new logonUser and sets the default values.
     * @return a void
     */
    public LogonUser() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.logonUser");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a logonUser
     */
    @javax.annotation.Nonnull
    public static LogonUser createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LogonUser();
    }
    /**
     * Gets the accountDomain property value. Domain of user account used to logon.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAccountDomain() {
        return this._accountDomain;
    }
    /**
     * Gets the accountName property value. Account name of user account used to logon.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAccountName() {
        return this._accountName;
    }
    /**
     * Gets the accountType property value. User Account type, per Windows definition. Possible values are: unknown, standard, power, administrator.
     * @return a userAccountSecurityType
     */
    @javax.annotation.Nullable
    public UserAccountSecurityType getAccountType() {
        return this._accountType;
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final LogonUser currentObject = this;
        return new HashMap<>(8) {{
            this.put("accountDomain", (n) -> { currentObject.setAccountDomain(n.getStringValue()); });
            this.put("accountName", (n) -> { currentObject.setAccountName(n.getStringValue()); });
            this.put("accountType", (n) -> { currentObject.setAccountType(n.getEnumValue(UserAccountSecurityType.class)); });
            this.put("firstSeenDateTime", (n) -> { currentObject.setFirstSeenDateTime(n.getOffsetDateTimeValue()); });
            this.put("lastSeenDateTime", (n) -> { currentObject.setLastSeenDateTime(n.getOffsetDateTimeValue()); });
            this.put("logonId", (n) -> { currentObject.setLogonId(n.getStringValue()); });
            this.put("logonTypes", (n) -> { currentObject.setLogonTypes(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the firstSeenDateTime property value. DateTime at which the earliest logon by this user account occurred (provider-determined period). The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getFirstSeenDateTime() {
        return this._firstSeenDateTime;
    }
    /**
     * Gets the lastSeenDateTime property value. DateTime at which the latest logon by this user account occurred. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastSeenDateTime() {
        return this._lastSeenDateTime;
    }
    /**
     * Gets the logonId property value. User logon ID.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLogonId() {
        return this._logonId;
    }
    /**
     * Gets the logonTypes property value. Collection of the logon types observed for the logged on user from when first to last seen. Possible values are: unknown, interactive, remoteInteractive, network, batch, service.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getLogonTypes() {
        return this._logonTypes;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("accountDomain", this.getAccountDomain());
        writer.writeStringValue("accountName", this.getAccountName());
        writer.writeEnumValue("accountType", this.getAccountType());
        writer.writeOffsetDateTimeValue("firstSeenDateTime", this.getFirstSeenDateTime());
        writer.writeOffsetDateTimeValue("lastSeenDateTime", this.getLastSeenDateTime());
        writer.writeStringValue("logonId", this.getLogonId());
        writer.writeCollectionOfPrimitiveValues("logonTypes", this.getLogonTypes());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the accountDomain property value. Domain of user account used to logon.
     * @param value Value to set for the accountDomain property.
     * @return a void
     */
    public void setAccountDomain(@javax.annotation.Nullable final String value) {
        this._accountDomain = value;
    }
    /**
     * Sets the accountName property value. Account name of user account used to logon.
     * @param value Value to set for the accountName property.
     * @return a void
     */
    public void setAccountName(@javax.annotation.Nullable final String value) {
        this._accountName = value;
    }
    /**
     * Sets the accountType property value. User Account type, per Windows definition. Possible values are: unknown, standard, power, administrator.
     * @param value Value to set for the accountType property.
     * @return a void
     */
    public void setAccountType(@javax.annotation.Nullable final UserAccountSecurityType value) {
        this._accountType = value;
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the firstSeenDateTime property value. DateTime at which the earliest logon by this user account occurred (provider-determined period). The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the firstSeenDateTime property.
     * @return a void
     */
    public void setFirstSeenDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._firstSeenDateTime = value;
    }
    /**
     * Sets the lastSeenDateTime property value. DateTime at which the latest logon by this user account occurred. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the lastSeenDateTime property.
     * @return a void
     */
    public void setLastSeenDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastSeenDateTime = value;
    }
    /**
     * Sets the logonId property value. User logon ID.
     * @param value Value to set for the logonId property.
     * @return a void
     */
    public void setLogonId(@javax.annotation.Nullable final String value) {
        this._logonId = value;
    }
    /**
     * Sets the logonTypes property value. Collection of the logon types observed for the logged on user from when first to last seen. Possible values are: unknown, interactive, remoteInteractive, network, batch, service.
     * @param value Value to set for the logonTypes property.
     * @return a void
     */
    public void setLogonTypes(@javax.annotation.Nullable final java.util.List<String> value) {
        this._logonTypes = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
}
