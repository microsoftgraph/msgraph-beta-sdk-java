package com.microsoft.graph.security.cases.ediscoverycases.item.searches.item.microsoftgraphsecurityexportreport;

import com.microsoft.graph.models.security.AdditionalOptions;
import com.microsoft.graph.models.security.ExportCriteria;
import com.microsoft.graph.models.security.ExportLocation;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ExportReportPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The additionalOptions property
     */
    private EnumSet<AdditionalOptions> additionalOptions;
    /**
     * The description property
     */
    private String description;
    /**
     * The displayName property
     */
    private String displayName;
    /**
     * The exportCriteria property
     */
    private EnumSet<ExportCriteria> exportCriteria;
    /**
     * The exportLocation property
     */
    private EnumSet<ExportLocation> exportLocation;
    /**
     * Instantiates a new ExportReportPostRequestBody and sets the default values.
     */
    public ExportReportPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ExportReportPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static ExportReportPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExportReportPostRequestBody();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the additionalOptions property value. The additionalOptions property
     * @return a EnumSet<AdditionalOptions>
     */
    @jakarta.annotation.Nullable
    public EnumSet<AdditionalOptions> getAdditionalOptions() {
        return this.additionalOptions;
    }
    /**
     * Gets the description property value. The description property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the exportCriteria property value. The exportCriteria property
     * @return a EnumSet<ExportCriteria>
     */
    @jakarta.annotation.Nullable
    public EnumSet<ExportCriteria> getExportCriteria() {
        return this.exportCriteria;
    }
    /**
     * Gets the exportLocation property value. The exportLocation property
     * @return a EnumSet<ExportLocation>
     */
    @jakarta.annotation.Nullable
    public EnumSet<ExportLocation> getExportLocation() {
        return this.exportLocation;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("additionalOptions", (n) -> { this.setAdditionalOptions(n.getEnumSetValue(AdditionalOptions.class)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("exportCriteria", (n) -> { this.setExportCriteria(n.getEnumSetValue(ExportCriteria.class)); });
        deserializerMap.put("exportLocation", (n) -> { this.setExportLocation(n.getEnumSetValue(ExportLocation.class)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumSetValue("additionalOptions", this.getAdditionalOptions());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeEnumSetValue("exportCriteria", this.getExportCriteria());
        writer.writeEnumSetValue("exportLocation", this.getExportLocation());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the additionalOptions property value. The additionalOptions property
     * @param value Value to set for the additionalOptions property.
     */
    public void setAdditionalOptions(@jakarta.annotation.Nullable final EnumSet<AdditionalOptions> value) {
        this.additionalOptions = value;
    }
    /**
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the exportCriteria property value. The exportCriteria property
     * @param value Value to set for the exportCriteria property.
     */
    public void setExportCriteria(@jakarta.annotation.Nullable final EnumSet<ExportCriteria> value) {
        this.exportCriteria = value;
    }
    /**
     * Sets the exportLocation property value. The exportLocation property
     * @param value Value to set for the exportLocation property.
     */
    public void setExportLocation(@jakarta.annotation.Nullable final EnumSet<ExportLocation> value) {
        this.exportLocation = value;
    }
}
