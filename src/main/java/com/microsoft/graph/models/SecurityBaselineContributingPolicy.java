package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** The security baseline compliance state of a setting for a device */
public class SecurityBaselineContributingPolicy implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Name of the policy */
    private String _displayName;
    /** Unique identifier of the policy */
    private String _sourceId;
    /** Authoring source of the policy. Possible values are: deviceConfiguration, deviceIntent. */
    private SecurityBaselinePolicySourceType _sourceType;
    /**
     * Instantiates a new securityBaselineContributingPolicy and sets the default values.
     * @return a void
     */
    public SecurityBaselineContributingPolicy() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a securityBaselineContributingPolicy
     */
    @javax.annotation.Nonnull
    public static SecurityBaselineContributingPolicy createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SecurityBaselineContributingPolicy();
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
     * Gets the displayName property value. Name of the policy
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
        final SecurityBaselineContributingPolicy currentObject = this;
        return new HashMap<>(3) {{
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("sourceId", (n) -> { currentObject.setSourceId(n.getStringValue()); });
            this.put("sourceType", (n) -> { currentObject.setSourceType(n.getEnumValue(SecurityBaselinePolicySourceType.class)); });
        }};
    }
    /**
     * Gets the sourceId property value. Unique identifier of the policy
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSourceId() {
        return this._sourceId;
    }
    /**
     * Gets the sourceType property value. Authoring source of the policy. Possible values are: deviceConfiguration, deviceIntent.
     * @return a securityBaselinePolicySourceType
     */
    @javax.annotation.Nullable
    public SecurityBaselinePolicySourceType getSourceType() {
        return this._sourceType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("sourceId", this.getSourceId());
        writer.writeEnumValue("sourceType", this.getSourceType());
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
     * Sets the displayName property value. Name of the policy
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the sourceId property value. Unique identifier of the policy
     * @param value Value to set for the sourceId property.
     * @return a void
     */
    public void setSourceId(@javax.annotation.Nullable final String value) {
        this._sourceId = value;
    }
    /**
     * Sets the sourceType property value. Authoring source of the policy. Possible values are: deviceConfiguration, deviceIntent.
     * @param value Value to set for the sourceType property.
     * @return a void
     */
    public void setSourceType(@javax.annotation.Nullable final SecurityBaselinePolicySourceType value) {
        this._sourceType = value;
    }
}
