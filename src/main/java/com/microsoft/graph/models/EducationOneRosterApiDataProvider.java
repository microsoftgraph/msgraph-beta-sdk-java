package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EducationOneRosterApiDataProvider extends EducationSynchronizationDataProvider implements Parsable {
    /**
     * The connectionSettings property
     */
    private EducationSynchronizationConnectionSettings connectionSettings;
    /**
     * The connection URL to the OneRoster instance.
     */
    private String connectionUrl;
    /**
     * Optional customization to be applied to the synchronization profile.
     */
    private EducationSynchronizationCustomizations customizations;
    /**
     * The OneRoster Service Provider name as defined by the [OneRoster specification][oneroster].
     */
    private String providerName;
    /**
     * The list of [School/Org][orgs] sourcedId to sync.
     */
    private java.util.List<String> schoolsIds;
    /**
     * The list of [academic sessions][terms] to sync.
     */
    private java.util.List<String> termIds;
    /**
     * Instantiates a new educationOneRosterApiDataProvider and sets the default values.
     */
    public EducationOneRosterApiDataProvider() {
        super();
        this.setOdataType("#microsoft.graph.educationOneRosterApiDataProvider");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a educationOneRosterApiDataProvider
     */
    @jakarta.annotation.Nonnull
    public static EducationOneRosterApiDataProvider createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationOneRosterApiDataProvider();
    }
    /**
     * Gets the connectionSettings property value. The connectionSettings property
     * @return a educationSynchronizationConnectionSettings
     */
    @jakarta.annotation.Nullable
    public EducationSynchronizationConnectionSettings getConnectionSettings() {
        return this.connectionSettings;
    }
    /**
     * Gets the connectionUrl property value. The connection URL to the OneRoster instance.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getConnectionUrl() {
        return this.connectionUrl;
    }
    /**
     * Gets the customizations property value. Optional customization to be applied to the synchronization profile.
     * @return a educationSynchronizationCustomizations
     */
    @jakarta.annotation.Nullable
    public EducationSynchronizationCustomizations getCustomizations() {
        return this.customizations;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
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
     * Gets the providerName property value. The OneRoster Service Provider name as defined by the [OneRoster specification][oneroster].
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getProviderName() {
        return this.providerName;
    }
    /**
     * Gets the schoolsIds property value. The list of [School/Org][orgs] sourcedId to sync.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSchoolsIds() {
        return this.schoolsIds;
    }
    /**
     * Gets the termIds property value. The list of [academic sessions][terms] to sync.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getTermIds() {
        return this.termIds;
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
        this.connectionSettings = value;
    }
    /**
     * Sets the connectionUrl property value. The connection URL to the OneRoster instance.
     * @param value Value to set for the connectionUrl property.
     */
    public void setConnectionUrl(@jakarta.annotation.Nullable final String value) {
        this.connectionUrl = value;
    }
    /**
     * Sets the customizations property value. Optional customization to be applied to the synchronization profile.
     * @param value Value to set for the customizations property.
     */
    public void setCustomizations(@jakarta.annotation.Nullable final EducationSynchronizationCustomizations value) {
        this.customizations = value;
    }
    /**
     * Sets the providerName property value. The OneRoster Service Provider name as defined by the [OneRoster specification][oneroster].
     * @param value Value to set for the providerName property.
     */
    public void setProviderName(@jakarta.annotation.Nullable final String value) {
        this.providerName = value;
    }
    /**
     * Sets the schoolsIds property value. The list of [School/Org][orgs] sourcedId to sync.
     * @param value Value to set for the schoolsIds property.
     */
    public void setSchoolsIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.schoolsIds = value;
    }
    /**
     * Sets the termIds property value. The list of [academic sessions][terms] to sync.
     * @param value Value to set for the termIds property.
     */
    public void setTermIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.termIds = value;
    }
}
