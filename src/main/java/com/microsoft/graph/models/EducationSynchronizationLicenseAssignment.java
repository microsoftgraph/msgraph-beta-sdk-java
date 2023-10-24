package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EducationSynchronizationLicenseAssignment implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The user role type to assign to license. Possible values are: student, teacher, faculty.
     */
    private EducationUserRole appliesTo;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Represents the SKU identifiers of the licenses to assign.
     */
    private java.util.List<String> skuIds;
    /**
     * Instantiates a new EducationSynchronizationLicenseAssignment and sets the default values.
     */
    public EducationSynchronizationLicenseAssignment() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EducationSynchronizationLicenseAssignment
     */
    @jakarta.annotation.Nonnull
    public static EducationSynchronizationLicenseAssignment createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationSynchronizationLicenseAssignment();
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
     * Gets the appliesTo property value. The user role type to assign to license. Possible values are: student, teacher, faculty.
     * @return a EducationUserRole
     */
    @jakarta.annotation.Nullable
    public EducationUserRole getAppliesTo() {
        return this.appliesTo;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("appliesTo", (n) -> { this.setAppliesTo(n.getEnumValue(EducationUserRole.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("skuIds", (n) -> { this.setSkuIds(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the skuIds property value. Represents the SKU identifiers of the licenses to assign.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSkuIds() {
        return this.skuIds;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("appliesTo", this.getAppliesTo());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfPrimitiveValues("skuIds", this.getSkuIds());
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
     * Sets the appliesTo property value. The user role type to assign to license. Possible values are: student, teacher, faculty.
     * @param value Value to set for the appliesTo property.
     */
    public void setAppliesTo(@jakarta.annotation.Nullable final EducationUserRole value) {
        this.appliesTo = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the skuIds property value. Represents the SKU identifiers of the licenses to assign.
     * @param value Value to set for the skuIds property.
     */
    public void setSkuIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.skuIds = value;
    }
}
