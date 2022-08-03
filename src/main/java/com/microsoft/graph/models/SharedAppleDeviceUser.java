package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SharedAppleDeviceUser implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Data quota */
    private Long _dataQuota;
    /** Data to sync */
    private Boolean _dataToSync;
    /** Data quota */
    private Long _dataUsed;
    /** The OdataType property */
    private String _odataType;
    /** User name */
    private String _userPrincipalName;
    /**
     * Instantiates a new sharedAppleDeviceUser and sets the default values.
     * @return a void
     */
    public SharedAppleDeviceUser() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.sharedAppleDeviceUser");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a sharedAppleDeviceUser
     */
    @javax.annotation.Nonnull
    public static SharedAppleDeviceUser createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SharedAppleDeviceUser();
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
     * Gets the dataQuota property value. Data quota
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getDataQuota() {
        return this._dataQuota;
    }
    /**
     * Gets the dataToSync property value. Data to sync
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDataToSync() {
        return this._dataToSync;
    }
    /**
     * Gets the dataUsed property value. Data quota
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getDataUsed() {
        return this._dataUsed;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SharedAppleDeviceUser currentObject = this;
        return new HashMap<>(5) {{
            this.put("dataQuota", (n) -> { currentObject.setDataQuota(n.getLongValue()); });
            this.put("dataToSync", (n) -> { currentObject.setDataToSync(n.getBooleanValue()); });
            this.put("dataUsed", (n) -> { currentObject.setDataUsed(n.getLongValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("userPrincipalName", (n) -> { currentObject.setUserPrincipalName(n.getStringValue()); });
        }};
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
     * Gets the userPrincipalName property value. User name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserPrincipalName() {
        return this._userPrincipalName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeLongValue("dataQuota", this.getDataQuota());
        writer.writeBooleanValue("dataToSync", this.getDataToSync());
        writer.writeLongValue("dataUsed", this.getDataUsed());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
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
     * Sets the dataQuota property value. Data quota
     * @param value Value to set for the dataQuota property.
     * @return a void
     */
    public void setDataQuota(@javax.annotation.Nullable final Long value) {
        this._dataQuota = value;
    }
    /**
     * Sets the dataToSync property value. Data to sync
     * @param value Value to set for the dataToSync property.
     * @return a void
     */
    public void setDataToSync(@javax.annotation.Nullable final Boolean value) {
        this._dataToSync = value;
    }
    /**
     * Sets the dataUsed property value. Data quota
     * @param value Value to set for the dataUsed property.
     * @return a void
     */
    public void setDataUsed(@javax.annotation.Nullable final Long value) {
        this._dataUsed = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the userPrincipalName property value. User name
     * @param value Value to set for the userPrincipalName property.
     * @return a void
     */
    public void setUserPrincipalName(@javax.annotation.Nullable final String value) {
        this._userPrincipalName = value;
    }
}
