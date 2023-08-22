package com.microsoft.graph.models.windowsupdates;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BuildVersionDetails implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The buildNumber property
     */
    private Integer buildNumber;
    /**
     * The majorVersion property
     */
    private Integer majorVersion;
    /**
     * The minorVersion property
     */
    private Integer minorVersion;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The updateBuildRevision property
     */
    private Integer updateBuildRevision;
    /**
     * Instantiates a new buildVersionDetails and sets the default values.
     */
    public BuildVersionDetails() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a buildVersionDetails
     */
    @jakarta.annotation.Nonnull
    public static BuildVersionDetails createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BuildVersionDetails();
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
     * Gets the buildNumber property value. The buildNumber property
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getBuildNumber() {
        return this.buildNumber;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("buildNumber", (n) -> { this.setBuildNumber(n.getIntegerValue()); });
        deserializerMap.put("majorVersion", (n) -> { this.setMajorVersion(n.getIntegerValue()); });
        deserializerMap.put("minorVersion", (n) -> { this.setMinorVersion(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("updateBuildRevision", (n) -> { this.setUpdateBuildRevision(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the majorVersion property value. The majorVersion property
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getMajorVersion() {
        return this.majorVersion;
    }
    /**
     * Gets the minorVersion property value. The minorVersion property
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getMinorVersion() {
        return this.minorVersion;
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
     * Gets the updateBuildRevision property value. The updateBuildRevision property
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getUpdateBuildRevision() {
        return this.updateBuildRevision;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("buildNumber", this.getBuildNumber());
        writer.writeIntegerValue("majorVersion", this.getMajorVersion());
        writer.writeIntegerValue("minorVersion", this.getMinorVersion());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("updateBuildRevision", this.getUpdateBuildRevision());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the buildNumber property value. The buildNumber property
     * @param value Value to set for the buildNumber property.
     */
    public void setBuildNumber(@jakarta.annotation.Nullable final Integer value) {
        this.buildNumber = value;
    }
    /**
     * Sets the majorVersion property value. The majorVersion property
     * @param value Value to set for the majorVersion property.
     */
    public void setMajorVersion(@jakarta.annotation.Nullable final Integer value) {
        this.majorVersion = value;
    }
    /**
     * Sets the minorVersion property value. The minorVersion property
     * @param value Value to set for the minorVersion property.
     */
    public void setMinorVersion(@jakarta.annotation.Nullable final Integer value) {
        this.minorVersion = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the updateBuildRevision property value. The updateBuildRevision property
     * @param value Value to set for the updateBuildRevision property.
     */
    public void setUpdateBuildRevision(@jakarta.annotation.Nullable final Integer value) {
        this.updateBuildRevision = value;
    }
}
