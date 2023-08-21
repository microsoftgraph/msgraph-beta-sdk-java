package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SolutionsRoot implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The businessScenarios property
     */
    private java.util.List<BusinessScenario> businessScenarios;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The virtualEvents property
     */
    private VirtualEventsRoot virtualEvents;
    /**
     * Instantiates a new solutionsRoot and sets the default values.
     */
    public SolutionsRoot() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a solutionsRoot
     */
    @jakarta.annotation.Nonnull
    public static SolutionsRoot createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SolutionsRoot();
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
     * Gets the businessScenarios property value. The businessScenarios property
     * @return a businessScenario
     */
    @jakarta.annotation.Nullable
    public java.util.List<BusinessScenario> getBusinessScenarios() {
        return this.businessScenarios;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("businessScenarios", (n) -> { this.setBusinessScenarios(n.getCollectionOfObjectValues(BusinessScenario::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("virtualEvents", (n) -> { this.setVirtualEvents(n.getObjectValue(VirtualEventsRoot::createFromDiscriminatorValue)); });
        return deserializerMap;
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
     * Gets the virtualEvents property value. The virtualEvents property
     * @return a virtualEventsRoot
     */
    @jakarta.annotation.Nullable
    public VirtualEventsRoot getVirtualEvents() {
        return this.virtualEvents;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("businessScenarios", this.getBusinessScenarios());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("virtualEvents", this.getVirtualEvents());
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
     * Sets the businessScenarios property value. The businessScenarios property
     * @param value Value to set for the businessScenarios property.
     */
    public void setBusinessScenarios(@jakarta.annotation.Nullable final java.util.List<BusinessScenario> value) {
        this.businessScenarios = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the virtualEvents property value. The virtualEvents property
     * @param value Value to set for the virtualEvents property.
     */
    public void setVirtualEvents(@jakarta.annotation.Nullable final VirtualEventsRoot value) {
        this.virtualEvents = value;
    }
}
