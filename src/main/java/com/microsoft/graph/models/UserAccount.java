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
public class UserAccount implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The displayName property */
    private String _displayName;
    /** The lastSeenDateTime property */
    private OffsetDateTime _lastSeenDateTime;
    /** The riskScore property */
    private String _riskScore;
    /** The service property */
    private String _service;
    /** The signinName property */
    private String _signinName;
    /** The status property */
    private AccountStatus _status;
    /**
     * Instantiates a new userAccount and sets the default values.
     * @return a void
     */
    public UserAccount() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userAccount
     */
    @javax.annotation.Nonnull
    public static UserAccount createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserAccount();
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
     * Gets the displayName property value. The displayName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UserAccount currentObject = this;
        return new HashMap<>(6) {{
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("lastSeenDateTime", (n) -> { currentObject.setLastSeenDateTime(n.getOffsetDateTimeValue()); });
            this.put("riskScore", (n) -> { currentObject.setRiskScore(n.getStringValue()); });
            this.put("service", (n) -> { currentObject.setService(n.getStringValue()); });
            this.put("signinName", (n) -> { currentObject.setSigninName(n.getStringValue()); });
            this.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(AccountStatus.class)); });
        }};
    }
    /**
     * Gets the lastSeenDateTime property value. The lastSeenDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastSeenDateTime() {
        return this._lastSeenDateTime;
    }
    /**
     * Gets the riskScore property value. The riskScore property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRiskScore() {
        return this._riskScore;
    }
    /**
     * Gets the service property value. The service property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getService() {
        return this._service;
    }
    /**
     * Gets the signinName property value. The signinName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSigninName() {
        return this._signinName;
    }
    /**
     * Gets the status property value. The status property
     * @return a accountStatus
     */
    @javax.annotation.Nullable
    public AccountStatus getStatus() {
        return this._status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("lastSeenDateTime", this.getLastSeenDateTime());
        writer.writeStringValue("riskScore", this.getRiskScore());
        writer.writeStringValue("service", this.getService());
        writer.writeStringValue("signinName", this.getSigninName());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeAdditionalData(this.getAdditionalData());
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
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the lastSeenDateTime property value. The lastSeenDateTime property
     * @param value Value to set for the lastSeenDateTime property.
     * @return a void
     */
    public void setLastSeenDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastSeenDateTime = value;
    }
    /**
     * Sets the riskScore property value. The riskScore property
     * @param value Value to set for the riskScore property.
     * @return a void
     */
    public void setRiskScore(@javax.annotation.Nullable final String value) {
        this._riskScore = value;
    }
    /**
     * Sets the service property value. The service property
     * @param value Value to set for the service property.
     * @return a void
     */
    public void setService(@javax.annotation.Nullable final String value) {
        this._service = value;
    }
    /**
     * Sets the signinName property value. The signinName property
     * @param value Value to set for the signinName property.
     * @return a void
     */
    public void setSigninName(@javax.annotation.Nullable final String value) {
        this._signinName = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final AccountStatus value) {
        this._status = value;
    }
}
