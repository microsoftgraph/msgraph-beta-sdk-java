# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]

### Added

### Changed

## [0.50.0] - 2022-06-15

### Added
 
- TeamsAppSettings model and requests. 

### Changed

- Updated beta models and request builders generated using Typewriter, based on latest Beta-Metadata.
- Models and requests with Attachment_v2 prefix changed to use AttachmentBase prefix. 
- Models and requests with FileAttachment_v2 prefix changed to use TaskFileAttachment prefix. 

## [0.49.0] - 2022-06-07

### Added
 
- AudioCodec, VideoCodec, NetworkTransportProtocol, TraceRouteHop models in the callRecords directory.
- AzureAdJoinPolicy and AzureADRegistrationPolicy models. 
- CrossCloudAzureActiveDirectoryTenant model.
- DefaultMfaMethodType model.  
- GroupWritebackConfiguration model. 
- MessagePinned & MessageUnpinned models.
- MultiFactorAuthConfiguration model. 
- WindowsManagedAppClipboardSharingLevel & WindowsManagedAppDataTransferLevel models. 
- WritebackConfiguration model. 
- Attachment_v2 models and related requests.
- DeletedTeam models and related requests. 
- DeviceManagementReports models and related requests. 
- DeviceRegistrationPolicy model and related requests. 
- DomainPromote models and related requests. 
- EducationAssignment models and related requests. 
- EducationFeedback models and related requests. 
- IosiPadOSWebClip model and related requests. 
- ManagedDeviceRemoveDeviceFirmwareConfigurationInterfaceManagement models and related requests. 
- PinnedChatMessageInfo model and related requests. 
- TeamworkSendActivityNotificationToRecipients models and related requests. 
- WindowsManagedAppProtection models and related requests.
- WindowsWebApp model and related requests. 
- OnPremisesAgentGroup requests. 
- TeamworkSendActivityNotificationToRecipients requests.
- TenantAdmin/models & TenantAdmin/requests directories. 

### Changed

- Updated beta models and request builders generated using Typewriter, based on latest Beta-Metadata.
- Models and requests realted to the added entities have been modified to reflect addition of new classes and requests/request builders. 

## [0.48.0] - 2022-05-19

### Added
 
- CloudPcForensicStorageAccount models and related requests. 
- Storage model and related requests. 

### Changed

- Updated beta models and request builders generated using Typewriter, based on latest Beta-Metadata.
- Updated models and requests related to the newly added CloudPcForensicsStorageAccount & Storage models, ie: CloudPcSnapshotCollectionRequestBuilder, GraphServiceClient, & ManagedDeviceBulkReprovisionCloudPcRequest. 

## [0.47.0] - 2022-05-12

### Added
 
- Added security features (models and requests) related to the Ediscovery-namespace to the Security-namespace.
- Added models and requests to the ManagedTenants-namespace.
- SignInConfirmation & SignInFrequency models and related requests. 
- ZebraFoto models and related requests.  
- DocumentSetVersion models and related requests. 

### Changed

- Updated beta models and request builders generated using Typewriter, based on latest Beta-Metadata.
- Removed managementCondition models and related requests from the general microsoftGraph-namespace.
- Updated dependencies of classes related to added models, added requests, and namespace updates.

## [0.46.0] - 2022-04-22

### Added
 
### Changed

- Bump dependency on Graph-Core to 2.0.12

## [0.45.0] - 2022-04-12

### Added
 
- ClientCredentialType model. 
- CloudPcUserAccessLevel model. 
- CloudPcReviewStatus models and related requests. 
- DocumentSetVersion models and related requests. 
- SignInConfirm models and related requests. 
- SubjectRightsRequest models. 
- DocumentSetVersion requests. 

### Changed

- Updated beta models and request builders generated using Typewriter, based on latest Beta-Metadata. 
- Models and requests related to the added models such as CloudPcOrganizationSettings model, SignIn model, SubjectRightsRequest model etc. 

## [0.44.0] - 2022-04-05

### Added
 
- AvailabilityItem model. 
- ExtractSensitivityLabelsResult model.
- KioskModeType model. 
- WindowsWiredNetworkConfiguration model and related requests.
- AospDeviceOwner models and related requests.
- BookingsAvailabilityStatus models and related requests.
- DeviceManagementConfigurationSecretSettingValue models. 
- DriveItemExtractSensitivityLabelsParameterSet models and related requests.
- SensitivityLabelAssignment models. 
- TenantAttachRBAC models and related requests. 
- WindowsDriverUpdateProfileInventorySync models.
- WiredNetworkAuthentication models. 
- ManagedDeviceCertificateState requests. 
- Windows81TrustedRootCertificateCollection requests.

### Changed

- Updated beta models and request builders generated using Typewriter, based on latest Beta-Metadata. 
- Updated referances to the added models and request builders in related classes, ex: AospDeviceOwnerCertificateProfileBase model, DeviceManagement model, DriveItemRequestBuilder request etc.

## [0.43.0] - 2022-03-29

### Added

- CloudPC and related models and requests.
- AddLargeGalleryViewOperation and related models and requests.
- MicrosoftApplicationDataAccessSettings and related requests.
- ChatMessageSoftDeleteParameterSet and ChatMessageUndoSoftDeleteParameterSet along with related models and requests for both. 
- InformationalUrls, JoinMeetingIdMeetingInfo, PrinterShareViewpoint, & UserPrint models. 

### Changed

- Updated beta models and request builders generated using Typewriter, based on latest Beta-Metadata. 
- Updated referances to the added models and request builders in related classes. 

## [0.42.0] - 2022-03-17

### Added

- CloudPC and related models and requests.
- TeamInfo and related models and requests.
- ChannelDoesUserHaveAccess and related models and requests. 
- ContentSharingSession and related requests. 

### Changed

- Updated beta models and request builders generated using Typewriter, based on latest Beta-Metadata. 
- Updated referances to the added models and requests builders in related classes. 

## [0.41.0] - 2022-03-03

### Added

- Models and Requests for the recently added Microsoft.graph.security namespace. 

### Changed

- Updated beta models and request builders generated using Typewriter, based on latest Beta-Metadata. 
- Alerts V_2 removed for testing. 

## [0.40.0] - 2022-02-03

### Added

- Models and Requests related, but not limited, to AuditEvent, SimulationAutomation.
- EDiscovery requests related to: Custodian(Apply/Remove)HoldParameterSet, NonCustodialDataSource(Apply/Remove)HoldRequest.
 
### Changed

- Updated beta models and request builders generated using Typewriter, based on latest Beta-Metadata. 
- AccessReviewHistoryDefinitionGenerateDownloadUriRequest(Builder) -> AccessReviewHistoryInstanceGenerateDownloadUriRequest(Builder)

## [0.39.0] - 2022-01-27

### Added

- Models and Requests related, but not limited, to AccessReviewHistoryInstance, CrossTenantAccessPolicy, X509Certificate,  & AccessReviewHistory. 

### Changed

- Updated beta models and request builders generated using Typewriter, based on latest Beta-Metadata. 

## [0.38.0] - 2022-01-20

### Added

- Models and Requests related, but not limited, to CloudPc, ManagedDevice, SkypeUser/SkypeBusinessConversationMember, and DomainFederation/Federated behavior. 

### Changed

- Updated beta models and request builders generated using Typewriter, based on latest Beta-Metadata. 

## [0.37.0] - 2022-01-11

### Added

- Models and requet classes related to the Teamwork endpoint. 

### Changed

- Updated beta models and request builders generated using Typewriter, based on latest Beta-Metadata. 

## [0.36.0] - 2022-01-05

### Added

- Plenty of class additions and updates relating to Bookings, Alert_V2, MeetingRegistration, & ConnectionQuota. 

### Changed

- Generated beta models and request builders using Typewriter and latest Metadata update. 
- M365Alert and related classes changed to Alert_V2 classes.
- HardwareConfig and related classes removed.

## [0.35.0] - 2021-12-15

### Added

### Changed

- Generated beta models and request builders using Typewriter and latest Metadata update.  

## [0.34.0] - 2021-11-30

### Added

### Changed

- Generated beta models and request builders using Typewriter using latest Metadata update. 
- Fix disambiguation for managementTemplate and managementTemplateCollection which had prevented us from releasing using latest metadata updates. 

## [0.33.0] - 2021-11-19

### Added

### Changed

- Generated beta models and request builders using Typewriter using Metadata update from 11/2.
- Due to changes in certain naming conventions in the beta-metadata casuing the latest updates to fail, this is the latest working version at the moment. 

## [0.32.0] - 2021-10-14

### Added

### Changed

- Generated beta models and request builders using Typewriter

## [0.31.0] - 2021-10-07

### Added

### Changed

- Generated beta models and request builders using Typewriter

## [0.30.0] - 2021-09-28

### Added

### Changed

- Generated beta models and request builders using Typewriter

## [0.29.0] - 2021-09-24

### Added

### Changed

- Generated beta models and request builders using Typewriter

## [0.28.0] - 2021-09-17

### Added

### Changed

- Generated beta models and request builders using Typewriter

## [0.27.0] - 2021-09-17

### Added

- Workflow for build validation
- Workflow for Maven Preview and GitHub Releases
- Workflow dispatch trigger to codeQL and api level lint

### Changed

- Generated beta models and request builders using Typewriter (#163)
- Juniper-api from 5.7.2 to 5.8.0
- Juniper-engine from 5.7.2 to 5.8.0 

