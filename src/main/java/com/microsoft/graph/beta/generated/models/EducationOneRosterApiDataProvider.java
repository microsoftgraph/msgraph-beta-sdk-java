package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EducationOneRosterApiDataProvider extends EducationSynchronizationDataProvider implements Parsable {
    /**
     * Instantiates a new {@link EducationOneRosterApiDataProvider} and sets the default values.
     */
    public EducationOneRosterApiDataProvider() {
        super();
        this.setOdataType("#microsoft.graph.educationOneRosterApiDataProvider");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EducationOneRosterApiDataProvider}
     */
    @jakarta.annotation.Nonnull
    public static EducationOneRosterApiDataProvider createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationOneRosterApiDataProvider();
    }
    /**
     * Gets the connectionSettings property value. The connectionSettings property
     * @return a {@link EducationSynchronizationConnectionSettings}
     */
    @jakarta.annotation.Nullable
    public EducationSynchronizationConnectionSettings getConnectionSettings() {
        return this.backingStore.get("connectionSettings");
    }
    /**
     * Gets the connectionUrl property value. The connection URL to the OneRoster instance.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getConnectionUrl() {
        return this.backingStore.get("connectionUrl");
    }
    /**
     * Gets the customizations property value. Optional customization to be applied to the synchronization profile.
     * @return a {@link EducationSynchronizationCustomizations}
     */
    @jakarta.annotation.Nullable
    public EducationSynchronizationCustomizations getCustomizations() {
        return this.backingStore.get("customizations");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("connectionSettings", (n) -> { this.setConnectionSettings(n.getObjectValue(EducationSynchronizationConnectionSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("connectionUrl", (n) -> { this.setConnectionUrl(n.getStringValue()); });
        deserializerMap.put("customizations", (n) -> { this.setCustomizations(n.getObjectValue(EducationSynchronizationCustomizations::createFromDiscriminatorValue)); });
        deserializerMap.put("providerName", (n) -> { this.setProviderName(n.getStringValue()); });
        deserializerMap.put("schoolsIds", (n) -> { this.setSchoolsIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("termIds", (n) -> { this.setTermIds(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the providerName property value. The OneRoster Service Provider name as defined by the OneRoster specification.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProviderName() {
        return this.backingStore.get("providerName");
    }
    /**
     * Gets the schoolsIds property value. The list of School/Org sourcedId to sync.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSchoolsIds() {
        return this.backingStore.get("schoolsIds");
    }
    /**
     * Gets the termIds property value. The list of academic sessions to sync.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getTermIds() {
        return this.backingStore.get("termIds");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("connectionSettings", this.getConnectionSettings());
        writer.writeStringValue("connectionUrl", this.getConnectionUrl());
        writer.writeObjectValue("customizations", this.getCustomizations());
        writer.writeStringValue("providerName", this.getProviderName());
        writer.writeCollectionOfPrimitiveValues("schoolsIds", this.getSchoolsIds());
        writer.writeCollectionOfPrimitiveValues("termIds", this.getTermIds());
    }
    /**
     * Sets the connectionSettings property value. The connectionSettings property
     * @param value Value to set for the connectionSettings property.
     */
    public void setConnectionSettings(@jakarta.annotation.Nullable final EducationSynchronizationConnectionSettings value) {
        this.backingStore.set("connectionSettings", value);
    }
    /**
     * Sets the connectionUrl property value. The connection URL to the OneRoster instance.
     * @param value Value to set for the connectionUrl property.
     */
    public void setConnectionUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("connectionUrl", value);
    }
    /**
     * Sets the customizations property value. Optional customization to be applied to the synchronization profile.
     * @param value Value to set for the customizations property.
     */
    public void setCustomizations(@jakarta.annotation.Nullable final EducationSynchronizationCustomizations value) {
        this.backingStore.set("customizations", value);
    }
    /**
     * Sets the providerName property value. The OneRoster Service Provider name as defined by the OneRoster specification.
     * @param value Value to set for the providerName property.
     */
    public void setProviderName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("providerName", value);
    }
    /**
     * Sets the schoolsIds property value. The list of School/Org sourcedId to sync.
     * @param value Value to set for the schoolsIds property.
     */
    public void setSchoolsIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("schoolsIds", value);
    }
    /**
     * Sets the termIds property value. The list of academic sessions to sync.
     * @param value Value to set for the termIds property.
     */
    public void setTermIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("termIds", value);
    }
}
