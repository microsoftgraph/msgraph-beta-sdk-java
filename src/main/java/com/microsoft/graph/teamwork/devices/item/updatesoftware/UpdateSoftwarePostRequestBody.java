package com.microsoft.graph.teamwork.devices.item.updatesoftware;

import com.microsoft.graph.models.TeamworkSoftwareType;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UpdateSoftwarePostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The softwareType property */
    private TeamworkSoftwareType softwareType;
    /** The softwareVersion property */
    private String softwareVersion;
    /**
     * Instantiates a new updateSoftwarePostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
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
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("softwareType", (n) -> { this.setSoftwareType(n.getEnumValue(TeamworkSoftwareType.class)); });
        deserializerMap.put("softwareVersion", (n) -> { this.setSoftwareVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the softwareType property value. The softwareType property
     * @return a TeamworkSoftwareType
     */
    @javax.annotation.Nullable
    public TeamworkSoftwareType getSoftwareType() {
        return this.softwareType;
    }
    /**
     * Gets the softwareVersion property value. The softwareVersion property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSoftwareVersion() {
        return this.softwareVersion;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
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
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the softwareType property value. The softwareType property
     * @param value Value to set for the softwareType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSoftwareType(@javax.annotation.Nullable final TeamworkSoftwareType value) {
        this.softwareType = value;
    }
    /**
     * Sets the softwareVersion property value. The softwareVersion property
     * @param value Value to set for the softwareVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSoftwareVersion(@javax.annotation.Nullable final String value) {
        this.softwareVersion = value;
    }
}
