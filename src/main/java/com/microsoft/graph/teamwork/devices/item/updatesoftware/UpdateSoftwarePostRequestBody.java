package com.microsoft.graph.teamwork.devices.item.updatesoftware;

import com.microsoft.graph.models.TeamworkSoftwareType;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the updateSoftware method. */
public class UpdateSoftwarePostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The softwareType property */
    private TeamworkSoftwareType _softwareType;
    /** The softwareVersion property */
    private String _softwareVersion;
    /**
     * Instantiates a new updateSoftwarePostRequestBody and sets the default values.
     * @return a void
     */
    public UpdateSoftwarePostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a updateSoftwarePostRequestBody
     */
    @javax.annotation.Nonnull
    public static UpdateSoftwarePostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UpdateSoftwarePostRequestBody();
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
        final UpdateSoftwarePostRequestBody currentObject = this;
        return new HashMap<>(2) {{
            this.put("softwareType", (n) -> { currentObject.setSoftwareType(n.getEnumValue(TeamworkSoftwareType.class)); });
            this.put("softwareVersion", (n) -> { currentObject.setSoftwareVersion(n.getStringValue()); });
        }};
    }
    /**
     * Gets the softwareType property value. The softwareType property
     * @return a teamworkSoftwareType
     */
    @javax.annotation.Nullable
    public TeamworkSoftwareType getSoftwareType() {
        return this._softwareType;
    }
    /**
     * Gets the softwareVersion property value. The softwareVersion property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSoftwareVersion() {
        return this._softwareVersion;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("softwareType", this.getSoftwareType());
        writer.writeStringValue("softwareVersion", this.getSoftwareVersion());
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
     * Sets the softwareType property value. The softwareType property
     * @param value Value to set for the softwareType property.
     * @return a void
     */
    public void setSoftwareType(@javax.annotation.Nullable final TeamworkSoftwareType value) {
        this._softwareType = value;
    }
    /**
     * Sets the softwareVersion property value. The softwareVersion property
     * @param value Value to set for the softwareVersion property.
     * @return a void
     */
    public void setSoftwareVersion(@javax.annotation.Nullable final String value) {
        this._softwareVersion = value;
    }
}
